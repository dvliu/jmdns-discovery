package com.dliu.jumper;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public abstract class ServiceAdapter implements ServiceListener {

	public void serviceAdded(final ServiceEvent event) {
	}

	public void serviceRemoved(final ServiceEvent event) {
	}

	public void serviceResolved(final ServiceEvent event) {
	}

}
