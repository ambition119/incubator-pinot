package org.apache.pinot.thirdeye.detection.alert.scheme;

import org.apache.pinot.thirdeye.anomaly.ThirdEyeAnomalyConfiguration;
import org.apache.pinot.thirdeye.datalayer.dto.DetectionAlertConfigDTO;
import org.apache.pinot.thirdeye.detection.alert.DetectionAlertFilterResult;


public class RandomAlerter extends DetectionAlertScheme {
  public RandomAlerter(DetectionAlertConfigDTO config, ThirdEyeAnomalyConfiguration thirdeyeConfig,
      DetectionAlertFilterResult result) {
    super(config, result);
  }

  @Override
  public void run() {

  }
}
