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
    int primary = context.getResources().getColor(darkTheme?android.R.color.system_accent1_200:android.R.color.system_accent1_500);
    return primary;
  }

  @SimpleFunction(description = "Get Primary Variant Color")
  public int GetPrimaryVariantColor() {
    int mainDark700 = context.getResources().getColor(android.R.color.system_accent1_700);
    return mainDark700;
  }

  @SimpleFunction(description = "Get Secondary Color")
  public int GetSecondaryColor() {
    int secondary200 = context.getResources().getColor(android.R.color.system_accent2_200);
    return secondary200;
  }

  @SimpleFunction(description = "Get Accent1 Color (Shade can be one of: 0, 10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)")
  public int GetAccent1Color(int shade) {
    switch(shade) {
      case 0:
        return context.getResources().getColor(android.R.color.system_accent1_0);
      case 10:
        return context.getResources().getColor(android.R.color.system_accent1_10);
      case 50:
        return context.getResources().getColor(android.R.color.system_accent1_50);
      case 100:
        return context.getResources().getColor(android.R.color.system_accent1_100);
      case 200:
        return context.getResources().getColor(android.R.color.system_accent1_200);
      case 300:
        return context.getResources().getColor(android.R.color.system_accent1_300);
      case 400:
        return context.getResources().getColor(android.R.color.system_accent1_400);
      case 500:
        return context.getResources().getColor(android.R.color.system_accent1_500);
      case 600:
        return context.getResources().getColor(android.R.color.system_accent1_600);
      case 700:
        return context.getResources().getColor(android.R.color.system_accent1_700);
      case 800:
        return context.getResources().getColor(android.R.color.system_accent1_800);
      case 900:
        return context.getResources().getColor(android.R.color.system_accent1_900);
      case 1000:
        return context.getResources().getColor(android.R.color.system_accent1_1000);
      default:
        return context.getResources().getColor(android.R.color.system_accent1_200);
    }
  }

  @SimpleFunction(description = "Get Accent2 Color (Shade can be one of: 0, 10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)")
  public int GetAccent2Color(int shade) {
    switch(shade) {
      case 0:
        return context.getResources().getColor(android.R.color.system_accent2_0);
      case 10:
        return context.getResources().getColor(android.R.color.system_accent2_10);
      case 50:
        return context.getResources().getColor(android.R.color.system_accent2_50);
      case 100:
        return context.getResources().getColor(android.R.color.system_accent2_100);
      case 200:
        return context.getResources().getColor(android.R.color.system_accent2_200);
      case 300:
        return context.getResources().getColor(android.R.color.system_accent2_300);
      case 400:
        return context.getResources().getColor(android.R.color.system_accent2_400);
      case 500:
        return context.getResources().getColor(android.R.color.system_accent2_500);
      case 600:
        return context.getResources().getColor(android.R.color.system_accent2_600);
      case 700:
        return context.getResources().getColor(android.R.color.system_accent2_700);
      case 800:
        return context.getResources().getColor(android.R.color.system_accent2_800);
      case 900:
        return context.getResources().getColor(android.R.color.system_accent2_900);
      case 1000:
        return context.getResources().getColor(android.R.color.system_accent2_1000);
      default:
        return context.getResources().getColor(android.R.color.system_accent2_200);
    }
  }

  @SimpleFunction(description = "Get Accent3 Color (Shade can be one of: 0, 10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)")
  public int GetAccent3Color(int shade) {
    switch(shade) {
      case 0:
        return context.getResources().getColor(android.R.color.system_accent3_0);
      case 10:
        return context.getResources().getColor(android.R.color.system_accent3_10);
      case 50:
        return context.getResources().getColor(android.R.color.system_accent3_50);
      case 100:
        return context.getResources().getColor(android.R.color.system_accent3_100);
      case 200:
        return context.getResources().getColor(android.R.color.system_accent3_200);
      case 300:
        return context.getResources().getColor(android.R.color.system_accent3_300);
      case 400:
        return context.getResources().getColor(android.R.color.system_accent3_400);
      case 500:
        return context.getResources().getColor(android.R.color.system_accent3_500);
      case 600:
        return context.getResources().getColor(android.R.color.system_accent3_600);
      case 700:
        return context.getResources().getColor(android.R.color.system_accent3_700);
      case 800:
        return context.getResources().getColor(android.R.color.system_accent3_800);
      case 900:
        return context.getResources().getColor(android.R.color.system_accent3_900);
      case 1000:
        return context.getResources().getColor(android.R.color.system_accent3_1000);
      default:
        return context.getResources().getColor(android.R.color.system_accent3_200);
    }
  }

  @SimpleFunction(description = "Get Neutral1 Color (Shade can be one of: 0, 10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)")
  public int GetNeutral1Color(int shade) {
    switch(shade) {
      case 0:
        return context.getResources().getColor(android.R.color.system_neutral1_0);
      case 10:
        return context.getResources().getColor(android.R.color.system_neutral1_10);
      case 50:
        return context.getResources().getColor(android.R.color.system_neutral1_50);
      case 100:
        return context.getResources().getColor(android.R.color.system_neutral1_100);
      case 200:
        return context.getResources().getColor(android.R.color.system_neutral1_200);
      case 300:
        return context.getResources().getColor(android.R.color.system_neutral1_300);
      case 400:
        return context.getResources().getColor(android.R.color.system_neutral1_400);
      case 500:
        return context.getResources().getColor(android.R.color.system_neutral1_500);
      case 600:
        return context.getResources().getColor(android.R.color.system_neutral1_600);
      case 700:
        return context.getResources().getColor(android.R.color.system_neutral1_700);
      case 800:
        return context.getResources().getColor(android.R.color.system_neutral1_800);
      case 900:
        return context.getResources().getColor(android.R.color.system_neutral1_900);
      case 1000:
        return context.getResources().getColor(android.R.color.system_neutral1_1000);
      default:
        return context.getResources().getColor(android.R.color.system_neutral1_200);
    }
  }

  @SimpleFunction(description = "Get Neutral2 Color (Shade can be one of: 0, 10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)")
  public int GetNeutral2Color(int shade) {
    switch(shade) {
      case 0:
        return context.getResources().getColor(android.R.color.system_neutral2_0);
      case 10:
        return context.getResources().getColor(android.R.color.system_neutral2_10);
      case 50:
        return context.getResources().getColor(android.R.color.system_neutral2_50);
      case 100:
        return context.getResources().getColor(android.R.color.system_neutral2_100);
      case 200:
        return context.getResources().getColor(android.R.color.system_neutral2_200);
      case 300:
        return context.getResources().getColor(android.R.color.system_neutral2_300);
      case 400:
        return context.getResources().getColor(android.R.color.system_neutral2_400);
      case 500:
        return context.getResources().getColor(android.R.color.system_neutral2_500);
      case 600:
        return context.getResources().getColor(android.R.color.system_neutral2_600);
      case 700:
        return context.getResources().getColor(android.R.color.system_neutral2_700);
      case 800:
        return context.getResources().getColor(android.R.color.system_neutral2_800);
      case 900:
        return context.getResources().getColor(android.R.color.system_neutral2_900);
      case 1000:
        return context.getResources().getColor(android.R.color.system_neutral2_1000);
      default:
        return context.getResources().getColor(android.R.color.system_neutral2_200);
    }
  }

  @SimpleFunction(description = "Is Dark Mode enabled?")
  public boolean IsDarkMode() {
    int nightModeFlags = context.getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
    return nightModeFlags == android.content.res.Configuration.UI_MODE_NIGHT_YES;
  }

}
