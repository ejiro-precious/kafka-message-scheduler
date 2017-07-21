package com.sky.kafka.message.scheduler.kafka

import org.apache.kafka.clients.consumer.ConsumerRecord

trait ConsumerRecordDecoder[T] {
  def apply(cr: ConsumerRecord[String, Array[Byte]]): T
}