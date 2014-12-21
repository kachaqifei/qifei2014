package com.example.menudemo;  

    import android.app.Activity;  

    import android.os.Bundle;  

    import android.util.Log;  

    import android.view.Menu;  

    import android.view.MenuInflater;  

    import android.view.MenuItem;  


    public class MainActivity extends Activity {  

        /** Called when the activity is first created. */  

        private static final String TAG="ReceiverActivity";  
    @Override  

        public void onCreate(Bundle savedInstanceState) {  

            super.onCreate(savedInstanceState);  

            setContentView(R.layout.activity_main);  

        }  
   @Override  

        public boolean onCreateOptionsMenu(Menu menu) {  

            // TODO Auto-generated method stub  

            MenuInflater mflater=new MenuInflater(this);  

            mflater.inflate(R.menu.main, menu);  

            return super.onCreateOptionsMenu(menu);  
        }  
        @Override  
        public boolean onOptionsItemSelected(MenuItem item) {  

            // TODO Auto-generated method stub  

            switch(item.getItemId()){  

            case R.id.close:  

                Log.v(TAG, "------------close");  

                break;  

            case R.id.no_icon:  

                Log.v(TAG, "------------noicon");  

                break;  

            case R.id.submenu:  

                Log.v(TAG, "------------submenu");  

                break;  

            case R.id.non_ghost:  

                Log.v(TAG, "------------non_ghost");  

                break;  

            case R.id.ghost:  

                Log.v(TAG, "------------ghost");  

                break;  

            case R.id.disabled:  

                Log.v(TAG, "------------disabled");  

                break;  
      case R.id.last:  
 Log.v(TAG, "------------last");  

                break;  
            case R.id.later:  
                Log.v(TAG, "------------laster");  

                break;  

            default:  

                break;  

            }  

            return super.onOptionsItemSelected(item);  

        }  

     }