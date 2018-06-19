# [<img src="ao-logo.png" alt="AO Logo" width="35" height="40">](https://github.com/aoindustries) [AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall) / [WebJars](https://github.com/aoindustries/ao-servlet-firewall-webjars)
<p>
	<a href="https://aoindustries.com/life-cycle#project-alpha">
		<img src="https://aoindustries.com/ao-badges/project-alpha.svg" alt="project: alpha" />
	</a>
	<a href="https://aoindustries.com/life-cycle#management-preview">
		<img src="https://aoindustries.com/ao-badges/management-preview.svg" alt="management: preview" />
	</a>
	<a href="https://aoindustries.com/life-cycle#packaging-developmental">
		<img src="https://aoindustries.com/ao-badges/packaging-developmental.svg" alt="packaging: developmental" />
	</a>
	<br />
	<a href="https://docs.oracle.com/javase/6/docs/api/">
		<img src="https://aoindustries.com/ao-badges/java-6.svg" alt="java: &gt;= 6" />
	</a>
	<a href="https://docs.oracle.com/javaee/6/api/">
		<img src="https://aoindustries.com/ao-badges/javaee-6.svg" alt="java ee: &gt;= 6" />
	</a>
	<a href="http://semver.org/spec/v2.0.0.html">
		<img src="https://aoindustries.com/ao-badges/semver-2.0.0.svg" alt="semantic versioning: 2.0.0" />
	</a>
	<a href="https://www.gnu.org/licenses/lgpl-3.0">
		<img src="https://aoindustries.com/ao-badges/license-lgpl-3.0.svg" alt="license: LGPL v3" />
	</a>
</p>

[AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall) rules for [WebJars](https://www.webjars.org/).

## Project Links
* [Project Home](https://aoindustries.com/ao-servlet-firewall/webjars/)
* [Changelog](https://aoindustries.com/ao-servlet-firewall/webjars/changelog)
* [API Docs](https://aoindustries.com/ao-servlet-firewall/webjars/apidocs/)
* [Maven Central Repository](https://search.maven.org/#search%7Cgav%7C1%7Cg:%22com.aoindustries%22%20AND%20a:%22ao-servlet-firewall-webjars%22)
* [GitHub](https://github.com/aoindustries/ao-servlet-firewall-webjars)

## Features
* Reserves greedy [Path Space](https://github.com/aoindustries/ao-servlet-firewall-path-space) for `/webjars/***` (no components in sub-paths may be added).
* Constrains [request method](https://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServletRequest.html#getMethod()) to `OPTIONS`, `HEAD`, and `GET`.
* TODO: Block all parameters for canonicalization?  Only allow LastModified?  301/302/307 redirect LastModified when doesn't match current LastModified (impact on clustering?)?
* Small footprint, minimal dependencies - not part of a big monolithic package.
* Java 1.6 implementation:
    * Java EE 6+ compatible.

## Motivation
[WebJars](https://www.webjars.org/) are wonderfully easy-to-use, just add a dependency to your project and off you go.  This reserves [Path Space](https://github.com/aoindustries/ao-servlet-firewall-path-space) for `/webjars/***` and opens the [AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall) to `OPTIONS`, `HEAD`, and `GET`.  Just add this project as an additional dependency and the firewall rules are ready-to-go (assuming `metadata-complete="false"` in `/WEB-INF/web.xml`).

## Evaluated Alternatives
As this is a component specific to [AO Servlet Firewall](https://github.com/aoindustries/ao-servlet-firewall), no ready-made alternatives exist.  It would also be possible to create your own rules, or rely on a default rule that opens all non-component paths (like `/** -> chain.doFilter`).

## Contact Us
For questions or support, please [contact us](https://aoindustries.com/contact):

Email: [support@aoindustries.com](mailto:support@aoindustries.com)  
Phone: [1-800-519-9541](tel:1-800-519-9541)  
Phone: [+1-251-607-9556](tel:+1-251-607-9556)  
Web: https://aoindustries.com/contact
