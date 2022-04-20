package com.checkout.android_sdk

import com.checkout.android_sdk.logging.FramesLoggingEventType
import com.checkout.eventlogger.domain.model.Event
import com.checkout.eventlogger.domain.model.MonitoringLevel
import java.util.*

open class TestFramesLoggingEvent internal constructor(
    override val monitoringLevel: MonitoringLevel,
    eventType: FramesLoggingEventType,
    override val properties: Map<String, Any> = emptyMap(),
    override val time: Date = Date(),
) : Event {

    override val typeIdentifier: String = eventType.eventId

}