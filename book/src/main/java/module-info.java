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
module com.aoapps.servlet.firewall.webjars.book {
  // Direct
  requires com.aoapps.badges; // <groupId>com.aoapps</groupId><artifactId>ao-badges</artifactId>
  requires com.aoapps.taglib; // <groupId>com.aoapps</groupId><artifactId>ao-taglib</artifactId>
  requires com.semanticcms.changelog.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-changelog-taglib</artifactId>
  requires com.semanticcms.core.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib</artifactId>
  requires com.semanticcms.section.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-taglib</artifactId>
  requires taglibs.standard.spec; // <groupId>org.apache.taglibs</groupId><artifactId>taglibs-standard-spec</artifactId>
}
