package org.opentripplanner.ext.flex.trip;

import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.TransitEntity;
import org.opentripplanner.model.Trip;
public abstract class FlexTrip extends TransitEntity<FeedScopedId> {

  protected final Trip trip;

  public FlexTrip(Trip trip) {
    this.trip = trip;
  }
  @Override
  public FeedScopedId getId() {
    return trip.getId();
  }

  public Trip getTrip() {
    return trip;
  }
}
