package org.openstack.client.identity;

import org.openstack.client.AbstractOpenStackTest;
import org.openstack.client.OpenstackAuthenticationClient;

public abstract class KeystoneIntegrationTest extends AbstractOpenStackTest {

	protected OpenstackAuthenticationClient getAuthenticationClient() {
		return context.session.getAuthenticationClient();
	}
	
}
