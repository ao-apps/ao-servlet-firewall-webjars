# [<img src="ao-logo.png" alt="AO Logo" width="35" height="40">](https://github.com/aoindustries) [AO OSS](https://github.com/aoindustries/ao-oss) / [Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall) / [WebJars](https://github.com/aoindustries/ao-servlet-firewall-webjars)

[![project: alpha](https://oss.aoapps.com/ao-badges/project-alpha.svg)](https://aoindustries.com/life-cycle#project-alpha)
[![management: preview](https://oss.aoapps.com/ao-badges/management-preview.svg)](https://aoindustries.com/life-cycle#management-preview)
[![packaging: developmental](https://oss.aoapps.com/ao-badges/packaging-developmental.svg)](https://aoindustries.com/life-cycle#packaging-developmental)  
[![java: &gt;= 11](https://oss.aoapps.com/ao-badges/java-11.svg)](https://docs.oracle.com/en/java/javase/11/docs/api/)
[![java ee: &gt;= 7](https://oss.aoapps.com/ao-badges/javaee-7.svg)](https://docs.oracle.com/javaee/7/api/)
[![semantic versioning: 2.0.0](https://oss.aoapps.com/ao-badges/semver-2.0.0.svg)](http://semver.org/spec/v2.0.0.html)
[![license: LGPL v3](https://oss.aoapps.com/ao-badges/license-lgpl-3.0.svg)](https://www.gnu.org/licenses/lgpl-3.0)

[AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall) rules for [WebJars](https://www.webjars.org/).

## Project Links
* [Project Home](https://oss.aoapps.com/servlet-firewall/webjars/)
* [Changelog](https://oss.aoapps.com/servlet-firewall/webjars/changelog)
* [API Docs](https://oss.aoapps.com/servlet-firewall/webjars/apidocs/)
* [Maven Central Repository](https://search.maven.org/artifact/com.aoapps/ao-servlet-firewall-webjars)
* [GitHub](https://github.com/aoindustries/ao-servlet-firewall-webjars)

## Features
* Reserves greedy [Path Space](https://github.com/aoindustries/ao-servlet-firewall-path-space) for `/webjars/***` (no components in sub-paths may be added).
* Constrains [request method](https://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServletRequest.html#getMethod()) to `OPTIONS`, `HEAD`, and `GET`.
* TODO: Block all parameters for canonicalization?  Only allow LastModified?  301/302/307 redirect LastModified when doesn't match current LastModified (impact on clustering?)?
* Small footprint, minimal dependencies - not part of a big monolithic package.
* Java 1.8 implementation:
    * Java EE 6+ compatible.

## Motivation
[WebJars](https://www.webjars.org/) are wonderfully easy-to-use, just add a dependency to your project and off you go.  This project reserves [Path Space](https://github.com/aoindustries/ao-servlet-firewall-path-space) for `/webjars/***` and opens the [AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall) to `OPTIONS`, `HEAD`, and `GET`.  Just add this project as an additional dependency and the firewall rules are ready-to-go (assuming `metadata-complete="false"` in `/WEB-INF/web.xml`).

## Evaluated Alternatives
As this is a component specific to [AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall), no ready-made alternatives exist.  It would also be possible to create your own rules, or rely on a default rule that opens all non-component paths (like `/** -> chain.doFilter`).

## Contact Us
For questions or support, please [contact us](https://aoindustries.com/contact):

Email: [support@aoindustries.com](mailto:support@aoindustries.com)  
Phone: [1-800-519-9541](tel:1-800-519-9541)  
Phone: [+1-251-607-9556](tel:+1-251-607-9556)  
Web: https://aoindustries.com/contact
