package net.sharewire.googlemapsclustering;

import android.support.annotation.NonNull;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by charlag on 28/03/2018.
 */

public interface RenderPostProcessor<T extends ClusterItem> {
  boolean postProcess(@NonNull Marker marker, @NonNull Cluster<T> cluster);
}
