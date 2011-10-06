package org.projectodd.polyglot.messaging.destinations;

import org.jboss.msc.service.ServiceName;

public class DestinationUtils {
    
    public static ServiceName getServiceName(String destinationName) {
        if (destinationName.startsWith( "/" )) {
            destinationName = destinationName.substring( 1 );
        }
        return ServiceName.parse( destinationName.replace( '/', '.' ) );
    }

}
