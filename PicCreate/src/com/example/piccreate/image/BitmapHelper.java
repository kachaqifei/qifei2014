package com.example.piccreate.image;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;

public class BitmapHelper {

	private final static String TAG = BitmapHelper.class.getSimpleName();

	public static Bitmap clipBitmap(Bitmap src, int x, int y, int w, int h) {
		Bitmap clipBmp = null;

		if (x < 0 || y < 0 || w <= 0 || h <= 0)
			return clipBmp;
		clipBmp = Bitmap.createBitmap(src, x, y, w, h);

		return clipBmp;
	}

	public static boolean saveBitmap(Bitmap bitmap, String dir, String name) {
		return saveBitmap(bitmap, dir + name);
	}

	public static boolean saveBitmap(Bitmap bitmap, String path) {
		boolean result = false;
		FileOutputStream fos = null;
		try {
			File file = new File(path);
			if (file.exists()) {
				Logger.i(TAG, "file exist: " + path);
			}
			fos = new FileOutputStream(file);
			bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
//			bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
			fos.flush();
			result = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (Exception e) {
			}
		}

		return result;
	}

	/**
	 * getBitmapFromPath
	 * 
	 * @param path
	 *            the path of the picture
	 * @return null if failed
	 */
	public static Bitmap getBitmapFromPath(String path) {
		if (CommonUtils.isPathExist(path)) {
			return BitmapFactory.decodeFile(path);
		}
		return null;
	}

	/**
	 * Get Bitmap from Path through a safe way <br>
	 * This Method will catch the OutOfMemoryError and retry {@Param
	 * retryTime}
	 */
	public static Bitmap getBitmapFromPathSafe(String path, int retryTime, boolean isDoCompress) {
		Bitmap tempBitmap = null;

		if (!CommonUtils.isPathExist(path)) {
			return null;
		}

		while (tempBitmap == null && retryTime > 0) {
			--retryTime;
			try {
				if (isDoCompress) {
					BitmapFactory.Options options = new BitmapFactory.Options();
					options.inSampleSize = 3 - retryTime;
					tempBitmap = BitmapFactory.decodeFile(path, options);
				} else {
					tempBitmap = BitmapFactory.decodeFile(path);
				}
			} catch (OutOfMemoryError eo) {
				System.gc();
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
				}
			}
		}
		return tempBitmap;
	}

	public static Bitmap getBitmapFromPathNewSize(String path,int maxnewwidth, int maxnewhight) {
		
		Bitmap tempBitmap = null;
		if (!CommonUtils.isPathExist(path)) {
			return null;
		}

		BitmapFactory.Options op = new BitmapFactory.Options();
		op.inJustDecodeBounds = true;
		try {
    		tempBitmap = BitmapFactory.decodeFile(path, op); 
    		int wRatio = (int) Math.ceil(op.outWidth / (float)maxnewwidth);
    		int hRatio = (int) Math.ceil(op.outHeight / (float)maxnewhight);
    
    		if (wRatio > 1 && hRatio > 1) {
    			if (wRatio > hRatio) {
    				op.inSampleSize = wRatio;
    			} else {
    				op.inSampleSize = hRatio;
    			}
    		}
    		op.inJustDecodeBounds = false;
    		tempBitmap = BitmapFactory.decodeFile(path, op);
		} catch (OutOfMemoryError e) {
		    e.printStackTrace();
		}

		return tempBitmap;
	}
	/**
	 * Get Bitmap from Path through a safe way <br>
	 * This Method will catch the OutOfMemoryError and retry {@Param
	 * retryTime}
	 */
	public static Bitmap getBitmapFromPathSafe(String path, int retryTime, int compressRate) {
		Bitmap tempBitmap = null;

		if (!CommonUtils.isPathExist(path)) {
			return null;
		}

		while (tempBitmap == null && retryTime > 0) {
			--retryTime;
			try {
				BitmapFactory.Options options = new BitmapFactory.Options();
				options.inSampleSize = compressRate;
				tempBitmap = BitmapFactory.decodeFile(path, options);
			} catch (OutOfMemoryError eo) {
				System.gc();
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
				}
			}
		}
		return tempBitmap;
	}

	/**
	 * Get Bitmap from a-copy-of-another-bitmap through a save way <br>
	 * This Method will catch the OutOfMemoryError and retry {@Param
	 * retryTime}
	 */
	public static Bitmap copyBitmapSave(Bitmap bitmap, int retryTime) {
		Bitmap tempBitmap = null;

		while (tempBitmap == null && retryTime > 0) {
			--retryTime;
			try {
				tempBitmap = bitmap.copy(Config.ARGB_8888, true);
			} catch (OutOfMemoryError eo) {
				System.gc();
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
				}
			}
		}
		return tempBitmap;
	}

	/**
	 * Create a empty Bitmap through a save way <br>
	 * This Method will catch the OutOfMemoryError and retry {@Param
	 * retryTime}
	 */
	public static Bitmap createBitmapSave(int width, int height, int retryTime) {
		Bitmap tempBitmap = null;

		while (tempBitmap == null && retryTime > 0) {
			--retryTime;
			try {
				tempBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
			} catch (OutOfMemoryError eo) {
				System.gc();
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
				}
			}
		}
		return tempBitmap;
	}

	/**
	 * rotateBitmap
	 * <p>
	 * To rotate your bitmap<br>
	 * return the rotate's bitmap and recyle the given src if need
	 * @param src
	 * @return
	 */
	public static Bitmap rotateBitmap(Bitmap src , int angle , boolean isRecyleScr) {
		Matrix matrix = new Matrix();
		matrix.postRotate(angle);
		Bitmap dstbmp = Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
		// recyle the given src if need
		if(isRecyleScr) recyleBitmap(src);
		return dstbmp;
	}
	
	public static Bitmap clipBitmapByPath(Bitmap srcBitmap , Path clipPath){
		/* fill canvas by bitmap */
		int w = srcBitmap.getWidth();
		int h = srcBitmap.getHeight();
		Bitmap bm = createBitmapSave(w, h, 3);
		if( bm == null ) return null;
		Canvas canvas = new Canvas(bm);
//		canvas.drawBitmap(srcBitmap,0,0,null);
		
		/* Do Clip */
		canvas.save();  
		canvas.clipPath(clipPath, Region.Op.INTERSECT);  
		canvas.drawBitmap(srcBitmap,0,0,null);
		canvas.restore();  
		canvas.save();  
		canvas.clipPath(clipPath, Region.Op.DIFFERENCE);
		canvas.drawColor(0xffFFFFFF);  
		canvas.restore();  
		
		/* return the clip bitmap & recyle the old one */
		RectF bound = new RectF();
		clipPath.computeBounds(bound, true);
		// recyle srcBitmap before create clipBitmap
		recyleBitmap(srcBitmap);
		Bitmap clipBitmap = Bitmap.createBitmap(w, h, Config.ARGB_8888);
		clipBitmap = clipBitmap(bm, (int)bound.left, (int)bound.top, (int)bound.width(), (int)bound.height());
		// recyle bm after created clipBitmap
		recyleBitmap(bm);
		
		return clipBitmap;
	}
	
	/**
	 * FlipBitmap
	 * <p>
	 * To flip your bitmap<br>
	 * return the rotate's bitmap and recyle the given src if need
	 * @param src
	 * @return
	 */
	public static Bitmap flipBitmap(Bitmap src , boolean isRecyleScr) {
		Matrix matrix = new Matrix();
		matrix.postScale(1,-1);
		Bitmap dstbmp = Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
		// recyle the given src if need
		if(isRecyleScr) recyleBitmap(src);
		return dstbmp;
	}

	/**
	 * recyleBitmap
	 * <p>
	 * To recyle your bitmap savely
	 * 
	 * @param bitmap
	 */
	public static void recyleBitmap(Bitmap bitmap) {
		if (bitmap != null && !bitmap.isRecycled()) {
			bitmap.recycle();
			bitmap = null;
			System.gc();
		}
	}

}
