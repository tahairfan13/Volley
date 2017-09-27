package com.example.tahaali.fypvolley.VolleyData;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class Singleton
{
    private static Singleton singleton;
    private RequestQueue requestQueue;
    private static Context context;
    private ImageLoader imageLoader;

    private Singleton(Context c)
    {
        context=c;
        requestQueue=getRequestQueue();
        imageLoader=new ImageLoader(requestQueue,
                new ImageLoader.ImageCache()
                {


                    private final LruCache<String,Bitmap> cache=new LruCache<String, Bitmap>((int)Runtime.getRuntime().maxMemory()/1024/8);



                    @Override
                    public Bitmap getBitmap(String url) {
                        return cache.get(url);
                    }

                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {
                        cache.put(url,bitmap);

                    }
                });
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    public RequestQueue getRequestQueue()
    {
        if(requestQueue!=null)
        {
            return requestQueue;
        }
        else
        {
          //  Cache cache=new DiskBasedCache(context.getApplicationContext().getCacheDir(),1024 * 1024);
          //  Network network=new BasicNetwork(new HurlStack());  //https://afzaln.com/volley/com/android/volley/toolbox/DiskBasedCache.html
          // requestQueue=new RequestQueue(cache,network);


           requestQueue= Volley.newRequestQueue(context.getApplicationContext());
            return requestQueue;
        }
    }

    public static synchronized Singleton getInstance(Context context) {
        if (singleton == null) {
            singleton = new Singleton(context);
        }
        return singleton;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }


}