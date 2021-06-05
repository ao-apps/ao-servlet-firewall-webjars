/*
 * ao-servlet-firewall-webjars - AO Servlet Firewall rules for WebJars.
 * Copyright (C) 2018, 2020, 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-servlet-firewall-webjars.
 *
 * ao-servlet-firewall-webjars is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-servlet-firewall-webjars is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-servlet-firewall-webjars.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoapps.servlet.firewall.webjars;

import static com.aoapps.net.pathspace.Prefix.valueOf;
import com.aoapps.servlet.firewall.pathspace.FirewallComponent;
import com.aoapps.servlet.firewall.pathspace.FirewallPathSpace;
import com.aoapps.servlet.firewall.rules.Rules.chain;
import com.aoapps.servlet.firewall.rules.Rules.request;
import com.aoapps.servlet.firewall.rules.Rules.response;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("Reserves greedy Path Space for " + WebJars.PREFIX + " (no components in sub-paths may be added).")
public class WebJars implements ServletContextListener {

	static final String PREFIX = "/webjars/***";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		FirewallPathSpace.getInstance(event.getServletContext()).add(
			FirewallComponent.newInstance(
				valueOf(PREFIX), // TODO: Use string overload of newInstance, once it exists
				// Constraint REQUEST dispatcher to GET only
				request.dispatcherType.isRequest(
					request.method.constrain(request.method.GET),
					chain.doFilter
				),
				// Drop everything else
				response.sendError.FORBIDDEN
			)
		);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// Do nothing
	}
}
