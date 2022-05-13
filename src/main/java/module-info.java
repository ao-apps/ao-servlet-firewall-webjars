/*
 * ao-servlet-firewall-webjars - AO Servlet Firewall rules for WebJars.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
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
 * along with ao-servlet-firewall-webjars.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.aoapps.servlet.firewall.webjars {
  exports com.aoapps.servlet.firewall.webjars;
  // Direct
  requires com.aoapps.net.pathspace; // <groupId>com.aoapps</groupId><artifactId>ao-net-path-space</artifactId>
  requires com.aoapps.servlet.firewall.api; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-api</artifactId>
  requires com.aoapps.servlet.firewall.pathspace; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-path-space</artifactId>
  requires com.aoapps.servlet.firewall.rules; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-rules</artifactId>
  requires javax.servlet.api; // <groupId>javax.servlet</groupId><artifactId>javax.servlet-api</artifactId>
}
