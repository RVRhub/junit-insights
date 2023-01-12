package de.adesso.junitinsights.spring

import de.adesso.junitinsights.model.Event
import de.adesso.junitinsights.model.EventLog
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.util.ObjectUtils

/**
 * Listens to the Spring ContextRefreshedEvent to register starting of the context
 * This callback is registered to the Spring Context in the BenchmarkContextCustomizerFactory
 * @see BenchmarkContextCustomizerFactory
 */
@Suppress("unused", "UNUSED_PARAMETER")
class ContextRefreshedListener: ApplicationListener<ContextRefreshedEvent> {

    /**
     * Logs the creation and refreshing of Spring Contexts during testing.
     * @see EventLog
     */
    override fun onApplicationEvent(event: ContextRefreshedEvent) {
        EventLog.log(Event("context refreshed", contextIdentityHex = ObjectUtils.getIdentityHexString(event.applicationContext)))
    }
}
