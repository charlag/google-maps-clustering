package net.sharewire.googlemapsclustering;

import android.support.annotation.NonNull;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by charlag on 28/03/2018.
 */

public final class MarkerState {

  private final Marker marker;
  private boolean isDirty;

  public MarkerState(@NonNull Marker marker, boolean isDirty) {
    this.marker = marker;
    this.isDirty = isDirty;
  }

  public MarkerState(@NonNull Marker marker) {
    this(marker, false);
  }

  @NonNull public Marker getMarker() {
    return marker;
  }

  public boolean isDirty() {
    return isDirty;
  }

  public void setDirty(boolean dirty) {
    isDirty = dirty;
  }
}