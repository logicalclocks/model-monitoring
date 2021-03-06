package io.hops.monitoring.util

import org.apache.spark.streaming.{Duration, Seconds}

object Constants {

  // Window

  object Window {
    val WindowColName = "window"
    val WindowColStartFieldName = "window.start"
    val WindowColEndFieldName = "window.end"

    val WindowStreamResolverQueryName = "WindowResolverStreamingQuery"
    val RawDurationColName = "rawDuration"
    val RawSlideDurationColName = "rawSlideDuration"
    val RawWatermarkDelayColName = "watermarkDelay"
    val DurationColName = "duration"
    val SlideDurationName = "slideDuration"
    val WatermarkDelayColName = "watermarkDelay"
    val ExecutedColName = "executed"

    object Defaults {
      val Duration: Duration = Seconds(1)
      val SlideDuration: Duration = Seconds(1)
      val WatermarkDelay: Duration = Seconds(2)
    }
  }

  // Stats

  object Stats {
    val StatColName = "stat"

    val Max = "max"
    val Min = "min"
    val Count = "count"
    val Sum = "sum"
    val Avg = "avg"
    val Mean = "mean"
    val Stddev = "stddev"

    val Simple = Seq(Max, Min, Sum, Count)
    val Compound = Seq(Avg, Mean)
    val Complex = Seq(Stddev)
    val Iterative = Seq(Stddev)
    val Watchable = Seq(Max, Min, Mean, Stddev)
    val All = Seq(Max, Min, Sum, Count, Avg, Mean, Stddev)
  }

  // Watcher

  object Watcher {
    val FeatureColName = "feature"
    val WatchedColName = "watched"
    val ThresholdColName = "threshold"
  }

  // File

  object File {
    val ParquetFormat = "parquet"
    val CsvFormat = "csv"

    val Path = "path"
    val CheckpointLocation = "checkpointLocation"
  }

  // Kafka

  object Kafka {
    val Format = "format"

    val Bootstrap_Servers = "kafka.bootstrap.servers"
    val Subscribe = "subscribe"
    val StartingOffsets = "startingOffsets"
    val SecurityProtocol = "kafka.security.protocol"
    val SSLTruststoreLocation = "kafka.ssl.truststore.location"
    val SSLTruststorePassword = "kafka.ssl.truststore.password"
    val SSLKeystoreLocation = "kafka.ssl.keystore.location"
    val SSLKeystorePassword = "kafka.ssl.keystore.location"
    val SSLKeyPassword = "kafka.ssl.key.password"
    val SSLEndpointIdentificationAlgorithm = "kafka.ssl.endpoint.identification.algorithm"
  }
}
