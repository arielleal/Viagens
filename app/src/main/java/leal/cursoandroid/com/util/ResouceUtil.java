package leal.cursoandroid.com.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResouceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String drawableEmPreco) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawableEmPreco, DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }
}
