# [<img src="ao-logo.png" alt="AO Logo" width="35" height="40">](https://github.com/ao-apps) [AO OSS](https://github.com/ao-apps/ao-oss) / [Servlet Firewall](https://github.com/ao-apps/ao-servlet-firewall) / [WebJars](https://github.com/ao-apps/ao-servlet-firewall-webjars)

[![project: alpha](https://oss.aoapps.com/ao-badges/project-alpha.svg)](https://aoindustries.com/life-cycle#project-alpha)
[![management: preview](https://oss.aoapps.com/ao-badges/management-preview.svg)](https://aoindustries.com/life-cycle#management-preview)
[![packaging: developmental](https://oss.aoapps.com/ao-badges/packaging-developmental.svg)](https://aoindustries.com/life-cycle#packaging-developmental)  
[![java: &gt;= 11](https://oss.aoapps.com/ao-badges/java-11.svg)](https://docs.oracle.com/en/java/javase/11/)
[![jakarta ee: &gt;= 10](https://oss.aoapps.com/ao-badges/jakartaee-10.svg)](https://jakarta.ee/release/10/)
[![semantic versioning: 2.0.0](https://oss.aoapps.com/ao-badges/semver-2.0.0.svg)](https://semver.org/spec/v2.0.0.html)
[![license: LGPL v3](https://oss.aoapps.com/ao-badges/license-lgpl-3.0.svg)](https://www.gnu.org/licenses/lgpl-3.0)

[![Build](https://github.com/ao-apps/ao-servlet-firewall-webjars/actions/workflows/build.yml/badge.svg?branch=jakartaee)](https://github.com/ao-apps/ao-servlet-firewall-webjars/actions?query=workflow%3ABuild)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.aoapps/ao-servlet-firewall-webjars/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.aoapps/ao-servlet-firewall-webjars)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?branch=jakartaee&project=com.aoapps%3Aao-servlet-firewall-webjars&metric=alert_status)](https://sonarcloud.io/dashboard?branch=jakartaee&id=com.aoapps%3Aao-servlet-firewall-webjars)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?branch=jakartaee&project=com.aoapps%3Aao-servlet-firewall-webjars&metric=ncloc)](https://sonarcloud.io/component_measures?branch=jakartaee&id=com.aoapps%3Aao-servlet-firewall-webjars&metric=ncloc)  
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?branch=jakartaee&project=com.aoapps%3Aao-servlet-firewall-webjars&metric=reliability_rating)](https://sonarcloud.io/component_measures?branch=jakartaee&id=com.aoapps%3Aao-servlet-firewall-webjars&metric=Reliability)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?branch=jakartaee&project=com.aoapps%3Aao-servlet-firewall-webjars&metric=security_rating)](https://sonarcloud.io/component_measures?branch=jakartaee&id=com.aoapps%3Aao-servlet-firewall-webjars&metric=Security)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?branch=jakartaee&project=com.aoapps%3Aao-servlet-firewall-webjars&metric=sqale_rating)](https://sonarcloud.io/component_measures?branch=jakartaee&id=com.aoapps%3Aao-servlet-firewall-webjars&metric=Maintainability)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?branch=jakartaee&project=com.aoapps%3Aao-servlet-firewall-webjars&metric=coverage)](https://sonarcloud.io/component_measures?branch=jakartaee&id=com.aoapps%3Aao-servlet-firewall-webjars&metric=Coverage)

[AO Servlet Firewall](https://github.com/ao-apps/ao-servlet-firewall) rules for [WebJars](https://www.webjars.org/).

## End of Life
This alpha branch never reached a production state.  This development path was leading to a solution with a level
of complexity that exceeds the complexity of the problems being solved.  We have designed a simpler alternative that
better builds on the existing Jakarta EE platform.  We will keep these alpha branches for reference, but will no
longer be updating or building these branches.

## Project Links
* [Project Home](https://oss.aoapps.com/servlet-firewall/webjars/)
* [Changelog](https://oss.aoapps.com/servlet-firewall/webjars/changelog)
* [API Docs](https://oss.aoapps.com/servlet-firewall/webjars/apidocs/)
* [Central Repository](https://central.sonatype.com/artifact/com.aoapps/ao-servlet-firewall-webjars)
* [GitHub](https://github.com/ao-apps/ao-servlet-firewall-webjars)

## Features
* Reserves greedy [Path Space](https://github.com/ao-apps/ao-servlet-firewall-path-space) for `/webjars/***` (no components in sub-paths may be added).
* Constrains [request method](https://jakarta.ee/specifications/platform/10/apidocs/jakarta/servlet/http/httpservletrequest#getMethod()) to `OPTIONS`, `HEAD`, and `GET`.
* TODO: Block all parameters for canonicalization?  Only allow LastModified?  301/302/307 redirect LastModified when doesn't match current LastModified (impact on clustering?)?
* Small footprint, minimal dependencies - not part of a big monolithic package.

## Motivation
[WebJars](https://www.webjars.org/) are wonderfully easy-to-use, just add a dependency to your project and off you go.  This project reserves [Path Space](https://github.com/ao-apps/ao-servlet-firewall-path-space) for `/webjars/***` and opens the [AO Servlet Firewall](https://github.com/ao-apps/ao-servlet-firewall) to `OPTIONS`, `HEAD`, and `GET`.  Just add this project as an additional dependency and the firewall rules are ready-to-go (assuming `metadata-complete="false"` in `/WEB-INF/web.xml`).

## Evaluated Alternatives
As this is a component specific to [AO Servlet Firewall](https://github.com/ao-apps/ao-servlet-firewall), no ready-made alternatives exist.  It would also be possible to create your own rules, or rely on a default rule that opens all non-component paths (like `/** -> chain.doFilter`).

## Contact Us
For questions or support, please [contact us](https://aoindustries.com/contact):

Email: [support@aoindustries.com](mailto:support@aoindustries.com)  
Phone: [1-800-519-9541](tel:1-800-519-9541)  
Phone: [+1-251-607-9556](tel:+1-251-607-9556)  
Web: https://aoindustries.com/contact
