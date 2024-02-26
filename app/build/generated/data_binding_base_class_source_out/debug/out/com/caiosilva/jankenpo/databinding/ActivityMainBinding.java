// Generated by view binder compiler. Do not edit!
package com.caiosilva.jankenpo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.caiosilva.jankenpo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageViewAppChoice;

  @NonNull
  public final ImageView imageViewPapel;

  @NonNull
  public final ImageView imageViewPedra;

  @NonNull
  public final ImageView imageViewTesoura;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageViewAppChoice,
      @NonNull ImageView imageViewPapel, @NonNull ImageView imageViewPedra,
      @NonNull ImageView imageViewTesoura) {
    this.rootView = rootView;
    this.imageViewAppChoice = imageViewAppChoice;
    this.imageViewPapel = imageViewPapel;
    this.imageViewPedra = imageViewPedra;
    this.imageViewTesoura = imageViewTesoura;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewAppChoice;
      ImageView imageViewAppChoice = ViewBindings.findChildViewById(rootView, id);
      if (imageViewAppChoice == null) {
        break missingId;
      }

      id = R.id.imageViewPapel;
      ImageView imageViewPapel = ViewBindings.findChildViewById(rootView, id);
      if (imageViewPapel == null) {
        break missingId;
      }

      id = R.id.imageViewPedra;
      ImageView imageViewPedra = ViewBindings.findChildViewById(rootView, id);
      if (imageViewPedra == null) {
        break missingId;
      }

      id = R.id.imageViewTesoura;
      ImageView imageViewTesoura = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTesoura == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, imageViewAppChoice, imageViewPapel,
          imageViewPedra, imageViewTesoura);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
