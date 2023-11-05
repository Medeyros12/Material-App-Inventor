package tech.kaffeine.m3colors;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;
import android.os.Build;
import android.content.Context;

public class M3Colors extends AndroidNonvisibleComponent {

  private Context context;

  public M3Colors(ComponentContainer container) {
    super(container.$form());
    this.context = container.$context();
  }

  @SimpleFunction(description = "Get Primary Color")
  public int GetPrimaryColor(boolean darkTheme) {
    int primary = context.getResources().getColor(darkTheme?android.R.color.system_accent1_500:android.R.color.system_accent1_200);
    return primary;
  }

  @SimpleFunction(description = "Get Main Dark Color")
  public int GetMainDarkColor() {
    int mainDark700 = context.getResources().getColor(android.R.color.system_accent1_700);
    return mainDark700;
  }

  @SimpleFunction(description = "Get Secondary Color")
  public int GetSecondaryColor() {
    int secondary200 = context.getResources().getColor(android.R.color.system_accent2_200);
    return secondary200;
  }

}
