![](https://img.shields.io/badge/STATUS-NOT%20CURRENTLY%20MAINTAINED-red.svg?longCache=true&style=flat)

# Important Notice
This public repository is read-only and no longer maintained.

# cloud-service-dq-api

Simple service wrapper/API for the SAP HANA Cloud Platform, Data Quality Microservice (DQaaS) 


Quick start
-----------

Activate the Data Quality Microservices (BETA) as outlined in this blog post:
[New HCP Service (Beta) - SAP Data Quality Management, microservices for location data](http://scn.sap.com/community/developer-center/cloud-platform/blog/2016/06/21/new-hcp-service-beta--sap-data-quality-management-microservices-for-location-data)

Clone the repo, `git clone https://github.com/SAP/cloud-service-dq-api.git`, or [download the latest release](https://github.com/SAP/cloud-service-dq-api/archive/master.zip).

Perform a Maven build and then deploy the `dqs.war` file within `target` directory of the  `cloud-service-dq-api-rs` sub-module to your SAP HANA Cloud Platform trial account as explained in the documentation:

+ [via cockpit](https://help.hana.ondemand.com/help/frameset.htm?abded969628240259d486c4b29b3948c.html)
+ [via command line](https://help.hana.ondemand.com/help/frameset.htm?030863cd5d0d4dd3b742957970f8eec9.html)
+ [via Eclipse IDE](https://help.hana.ondemand.com/help/frameset.htm?60ab35d9edde43a1b38cf48174a3dca2.html)

You can then invoke the `Address Cleanse` Microservice via the following URL:

> https://dqaasXYZ.hanatrial.ondemand.com/dq/addressCleanse

**NOTE:** Replace XYZ with your own account name, e.g. p12345678 and double-check that your app name matches 'dqaas'.

Please note that there's a set/collection of sample content for service invocations for [Postman](https://www.getpostman.com/) available here:

[cloud-service-dq-api-rs/src/test/resources/DQaaS.json](/cloud-service-dq-api-rs/src/test/resources/DQaaS.json)

Further reading 
-----------

+ [Introduction blog post](http://scn.sap.com/community/developer-center/cloud-platform/blog/2016/06/21/new-hcp-service-beta--sap-data-quality-management-microservices-for-location-data)
+ [Online documentation](http://help.sap.com/saphelpiis_dqmmicro1/dqm_micro_loc_1_dev_en/frameset.htm)



Versioning
----------

For transparency and insight into our release cycle, and for striving to maintain backward compatibility, the SAP HANA Cloud Platform -Samples project will be maintained under the Semantic Versioning guidelines as much as possible.

Releases will be numbered with the following format:

`<major>.<minor>.<patch>`

And constructed with the following guidelines:

* Breaking backward compatibility bumps the major (and resets the minor and patch)
* New additions without breaking backward compatibility bumps the minor (and resets the patch)
* Bug fixes and misc changes bumps the patch

For more information on SemVer, please visit http://semver.org/


Authors
-------

**Matthias Steiner**

+ http://twitter.com/steinermatt
+ http://github.com/steinermatt


Copyright and license
---------------------

Copyright (c) 2016 SAP SE

Except as provided below, this software is licensed under the Apache License, Version 2.0 (the "License"); you may not use this software except in compliance with the License.You may obtain a copy of the License at:

[http://www.apache.org/licenses/LICENSE-2.0] (http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
