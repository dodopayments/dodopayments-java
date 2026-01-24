# Changelog

## 1.75.1 (2026-01-24)

Full Changelog: [v1.75.0...v1.75.1](https://github.com/dodopayments/dodopayments-java/compare/v1.75.0...v1.75.1)

### Chores

* **ci:** upgrade `actions/github-script` ([68ee340](https://github.com/dodopayments/dodopayments-java/commit/68ee340011d15d84d05de846b3973d3d7a1d3a31))

## 1.75.0 (2026-01-23)

Full Changelog: [v1.74.0...v1.75.0](https://github.com/dodopayments/dodopayments-java/compare/v1.74.0...v1.75.0)

### Features

* **api:** updated openapi spec to v1.75.0 ([2d85f1e](https://github.com/dodopayments/dodopayments-java/commit/2d85f1e9d8b685d94744b22ec9f020868beec59c))
* **client:** send `X-Stainless-Kotlin-Version` header ([6a17f92](https://github.com/dodopayments/dodopayments-java/commit/6a17f926da9265ef8b15adaeed028534b5461910))


### Bug Fixes

* **client:** preserve time zone in lenient date-time parsing ([3127afd](https://github.com/dodopayments/dodopayments-java/commit/3127afdd2b6b28d092971f743f78f8a439211c19))
* **tests:** add missing query/header params ([f9cc1e3](https://github.com/dodopayments/dodopayments-java/commit/f9cc1e37e7aadffae5e9864909c3fc9b3c8db3f1))


### Chores

* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([dde8efc](https://github.com/dodopayments/dodopayments-java/commit/dde8efc564ba5a16b5647eb004edff8a05ce404e))
* **internal:** update maven repo doc to include authentication ([c91a6c0](https://github.com/dodopayments/dodopayments-java/commit/c91a6c03954cdd2096db46231b5a265a116e34e1))

## 1.74.0 (2026-01-21)

Full Changelog: [v1.73.0...v1.74.0](https://github.com/dodopayments/dodopayments-java/compare/v1.73.0...v1.74.0)

### Features

* **api:** updated openapi spec to v1.74.0 ([acc32e8](https://github.com/dodopayments/dodopayments-java/commit/acc32e815064fac048637b3b110618f5e62b9d3d))

## 1.73.0 (2026-01-20)

Full Changelog: [v1.71.1...v1.73.0](https://github.com/dodopayments/dodopayments-java/compare/v1.71.1...v1.73.0)

### Features

* **api:** update openapi spec to v1.73.0 ([6667900](https://github.com/dodopayments/dodopayments-java/commit/66679005bc392479b3ca30d7abb8fbc8ba9c6914))


### Bug Fixes

* **client:** disallow coercion from float to int ([853571a](https://github.com/dodopayments/dodopayments-java/commit/853571ad3fa4cbde2fad04ca1596ff94aeda5dcb))
* **client:** fully respect max retries ([174d5bd](https://github.com/dodopayments/dodopayments-java/commit/174d5bdc75664b46d2e3755395e5d02d0d12cfc0))
* **client:** send retry count header for max retries 0 ([174d5bd](https://github.com/dodopayments/dodopayments-java/commit/174d5bdc75664b46d2e3755395e5d02d0d12cfc0))
* date time deserialization leniency ([0115d05](https://github.com/dodopayments/dodopayments-java/commit/0115d05dd0d7b41d3ed3fac06deaf6e374f8dd6d))


### Chores

* **ci:** upgrade `actions/setup-java` ([ad1150c](https://github.com/dodopayments/dodopayments-java/commit/ad1150c0956eca5d40c63ed22b999697210bbd5f))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([b3cfb4b](https://github.com/dodopayments/dodopayments-java/commit/b3cfb4b40dec9075db879c43902ebeec7bb1995f))
* **internal:** depend on packages directly in example ([174d5bd](https://github.com/dodopayments/dodopayments-java/commit/174d5bdc75664b46d2e3755395e5d02d0d12cfc0))
* **internal:** improve maven repo docs ([ed47bcd](https://github.com/dodopayments/dodopayments-java/commit/ed47bcdf3d1c71f08a9434481fce1b78bef5e6e9))
* **internal:** update `actions/checkout` version ([425df16](https://github.com/dodopayments/dodopayments-java/commit/425df1648ae99a3a287d2c243a9276a22d68464e))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/dodopayments/dodopayments-java/issues/3240) in tests ([0115d05](https://github.com/dodopayments/dodopayments-java/commit/0115d05dd0d7b41d3ed3fac06deaf6e374f8dd6d))

## 1.71.1 (2026-01-13)

Full Changelog: [v1.71.0...v1.71.1](https://github.com/dodopayments/dodopayments-java/compare/v1.71.0...v1.71.1)

### Features

* **client:** allow configuring dispatcher executor service ([d00e32a](https://github.com/dodopayments/dodopayments-java/commit/d00e32a3695bc541cfe71602f7813fbb1b341d38))


### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([852e21d](https://github.com/dodopayments/dodopayments-java/commit/852e21d428de78704e0a145f24c501bc7ca60891))

## 1.71.0 (2026-01-07)

Full Changelog: [v1.70.0...v1.71.0](https://github.com/dodopayments/dodopayments-java/compare/v1.70.0...v1.71.0)

### Features

* **api:** updated openapi spec to v1.70.0 ([a16fbbf](https://github.com/dodopayments/dodopayments-java/commit/a16fbbf5b09a73d71a545c5e5a07d53cb849ad98))
* **client:** add `HttpRequest#url()` method ([301adb0](https://github.com/dodopayments/dodopayments-java/commit/301adb07544935f834f1dff183cfc93bd124d796))


### Documentation

* prominently feature MCP server setup in root SDK readmes ([fa44cdc](https://github.com/dodopayments/dodopayments-java/commit/fa44cdcc9919e7cc912a8572f323be18b31c17ca))

## 1.70.0 (2025-12-23)

Full Changelog: [v1.69.0...v1.70.0](https://github.com/dodopayments/dodopayments-java/compare/v1.69.0...v1.70.0)

### Features

* **api:** manual updates ([743bd3d](https://github.com/dodopayments/dodopayments-java/commit/743bd3db8bd830540bea09ddf7f3d50d8bdcf3e1))

## 1.69.0 (2025-12-23)

Full Changelog: [v1.68.0...v1.69.0](https://github.com/dodopayments/dodopayments-java/compare/v1.68.0...v1.69.0)

### Features

* **api:** manual updates ([81c0a38](https://github.com/dodopayments/dodopayments-java/commit/81c0a3832c4e5cce1ec0f901a02dc308f976ec32))

## 1.68.0 (2025-12-19)

Full Changelog: [v1.67.0...v1.68.0](https://github.com/dodopayments/dodopayments-java/compare/v1.67.0...v1.68.0)

### Features

* **api:** updated openapi spec to v1.68.4 ([11d1fa6](https://github.com/dodopayments/dodopayments-java/commit/11d1fa6ba47b1237f4e18964ab0f8223ea6aeff0))

## 1.67.0 (2025-12-16)

Full Changelog: [v1.66.1...v1.67.0](https://github.com/dodopayments/dodopayments-java/compare/v1.66.1...v1.67.0)

### Features

* **api:** updated openapi spec to 1.67.0 ([8252c4c](https://github.com/dodopayments/dodopayments-java/commit/8252c4c985e3cbc8ca31e48c8ca74fbb5c6059b7))

## 1.66.1 (2025-12-12)

Full Changelog: [v1.66.0...v1.66.1](https://github.com/dodopayments/dodopayments-java/compare/v1.66.0...v1.66.1)

### Features

* **api:** manual updates ([6817761](https://github.com/dodopayments/dodopayments-java/commit/68177618eac1b61a45682f8ec04bb25bce2e907a))

## 1.66.0 (2025-12-08)

Full Changelog: [v1.61.6...v1.66.0](https://github.com/dodopayments/dodopayments-java/compare/v1.61.6...v1.66.0)

### Features

* **api:** updated openapi spec to v1.66.1 ([bf0211b](https://github.com/dodopayments/dodopayments-java/commit/bf0211bf52ca52c998889be62928987f27e12940))

## 1.61.6 (2025-12-03)

Full Changelog: [v1.61.5...v1.61.6](https://github.com/dodopayments/dodopayments-java/compare/v1.61.5...v1.61.6)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([a0b7729](https://github.com/dodopayments/dodopayments-java/commit/a0b7729a820656b8063ca8af65108e87734245ba))


### Documentation

* remove `$` for better copy-pasteabality ([2af988f](https://github.com/dodopayments/dodopayments-java/commit/2af988f2f3d140ec6bf732ae2aaa3eeb527d5717))

## 1.61.5 (2025-11-17)

Full Changelog: [v1.60.0...v1.61.5](https://github.com/dodopayments/dodopayments-java/compare/v1.60.0...v1.61.5)

### Features

* **api:** updated openapi spec to v1.61.5 ([2f2e02c](https://github.com/dodopayments/dodopayments-java/commit/2f2e02cc26cba199b9c44276ad3a383dbc5054be))

## 1.60.0 (2025-11-14)

Full Changelog: [v1.56.6...v1.60.0](https://github.com/dodopayments/dodopayments-java/compare/v1.56.6...v1.60.0)

### Features

* **api:** added update payment method and updated openapi spec to v1.60.0 ([efcb2fb](https://github.com/dodopayments/dodopayments-java/commit/efcb2fb19f7012812148c69b66e6d215677dbab8))


### Bug Fixes

* **client:** multi-value header serialization ([87a40e4](https://github.com/dodopayments/dodopayments-java/commit/87a40e4e491b327611cad78e738ddddcda6d876c))

## 1.56.6 (2025-11-07)

Full Changelog: [v1.56.5...v1.56.6](https://github.com/dodopayments/dodopayments-java/compare/v1.56.5...v1.56.6)

### Features

* **api:** set java and kotlin sonatype publishing to portal ([9172aec](https://github.com/dodopayments/dodopayments-java/commit/9172aec5ef0f10edc7445770137ff86f8735eefc))

## 1.56.5 (2025-10-31)

Full Changelog: [v1.56.4...v1.56.5](https://github.com/dodopayments/dodopayments-java/compare/v1.56.4...v1.56.5)

## 1.56.4 (2025-10-29)

Full Changelog: [v1.56.3...v1.56.4](https://github.com/dodopayments/dodopayments-java/compare/v1.56.3...v1.56.4)

### Features

* **api:** updated openapi spec to v1.56.3 ([006f6b8](https://github.com/dodopayments/dodopayments-java/commit/006f6b8816514c5858909c543259e4c6ba56b70b))

## 1.56.3 (2025-10-27)

Full Changelog: [v1.56.0...v1.56.3](https://github.com/dodopayments/dodopayments-java/compare/v1.56.0...v1.56.3)

### Features

* **api:** updated to openapi spec v1.56.0 ([d1a8b83](https://github.com/dodopayments/dodopayments-java/commit/d1a8b837ca375723dac340e4d6f1c11b4ff760e5))

## 1.56.0 (2025-10-25)

Full Changelog: [v1.55.7...v1.56.0](https://github.com/dodopayments/dodopayments-java/compare/v1.55.7...v1.56.0)

### Features

* **api:** added unwrap functions for webhooks ([1098fec](https://github.com/dodopayments/dodopayments-java/commit/1098fecff53d959d59db4abad4be9d1c39319980))

## 1.55.7 (2025-10-17)

Full Changelog: [v1.55.0...v1.55.7](https://github.com/dodopayments/dodopayments-java/compare/v1.55.0...v1.55.7)

### Features

* **api:** updates for openapi spec v1.55.7 ([1f9d0eb](https://github.com/dodopayments/dodopayments-java/commit/1f9d0eb564da05316e0d1a129d5e00572b5d1c38))

## 1.55.0 (2025-10-16)

Full Changelog: [v1.53.4...v1.55.0](https://github.com/dodopayments/dodopayments-java/compare/v1.53.4...v1.55.0)

### Features

* **api:** updated openapi spec to v1.55.0 ([06f9b95](https://github.com/dodopayments/dodopayments-java/commit/06f9b9584d3f22cd1b39be68900657dfb97ddbd4))

## 1.53.4 (2025-09-26)

Full Changelog: [v1.53.3...v1.53.4](https://github.com/dodopayments/dodopayments-java/compare/v1.53.3...v1.53.4)

### Bug Fixes

* **client:** deserialization of empty objects ([0e2dcab](https://github.com/dodopayments/dodopayments-java/commit/0e2dcab767200d2db8b1358bdee7a335effe942b))

## 1.53.3 (2025-09-25)

Full Changelog: [v1.53.2...v1.53.3](https://github.com/dodopayments/dodopayments-java/compare/v1.53.2...v1.53.3)

### Chores

* **internal:** codegen related update ([abe4ad7](https://github.com/dodopayments/dodopayments-java/commit/abe4ad7add8befafb584e8b78cd1491d8e2efab9))

## 1.53.2 (2025-09-24)

Full Changelog: [v1.47.1...v1.53.2](https://github.com/dodopayments/dodopayments-java/compare/v1.47.1...v1.53.2)

### Features

* **api:** manual updates ([5308663](https://github.com/dodopayments/dodopayments-java/commit/5308663903b12f14f88cc72ed02f17fbe4d45777))
* **api:** manual updates ([32eef24](https://github.com/dodopayments/dodopayments-java/commit/32eef246d9cea2783ef968537f9a61e66ca08457))
* **client:** add convenience overloads for some methods ([977c5f3](https://github.com/dodopayments/dodopayments-java/commit/977c5f3e4fd71de43ccb5b1bd1383f1306ad2d05))
* **client:** expose sleeper option ([6a1400b](https://github.com/dodopayments/dodopayments-java/commit/6a1400b73a305af933828aa06559c50b32d8eca6))


### Bug Fixes

* **client:** ensure single timer is created per client ([6a1400b](https://github.com/dodopayments/dodopayments-java/commit/6a1400b73a305af933828aa06559c50b32d8eca6))
* **client:** incorrect `getPackageVersion` impl ([b6bebb0](https://github.com/dodopayments/dodopayments-java/commit/b6bebb042dee61e79e212ad3c1811c3d874fe69e))


### Chores

* **internal:** codegen related update ([1c0b780](https://github.com/dodopayments/dodopayments-java/commit/1c0b78096e5daeb7e1ec0620adb97a36ab22cf44))
* **internal:** codegen related update ([0e2f89c](https://github.com/dodopayments/dodopayments-java/commit/0e2f89cb057ec273c3ea015b9a112e64932a5ec7))

## 1.47.1 (2025-08-13)

Full Changelog: [v1.47.0...v1.47.1](https://github.com/dodopayments/dodopayments-java/compare/v1.47.0...v1.47.1)

### Chores

* **internal:** codegen related update ([e88566b](https://github.com/dodopayments/dodopayments-java/commit/e88566bc2a62e7b1dd6cd9306475b798c78b10f3))

## 1.47.0 (2025-08-11)

Full Changelog: [v1.43.2...v1.47.0](https://github.com/dodopayments/dodopayments-java/compare/v1.43.2...v1.47.0)

### Features

* **api:** updated openapi spec to 1.47.0 ([b209758](https://github.com/dodopayments/dodopayments-java/commit/b20975836b8a9fd9ec20d0fdda24f892a1154241))


### Chores

* **example:** fix run example comment ([495bb1d](https://github.com/dodopayments/dodopayments-java/commit/495bb1dd605749606fb32478bb41a14a0ae05b51))
* increase max gradle JVM heap to 8GB ([e6dd536](https://github.com/dodopayments/dodopayments-java/commit/e6dd536e9137eb779e7b9c5526e6604184aeb2cb))
* **internal:** add async lock helper ([4d023bf](https://github.com/dodopayments/dodopayments-java/commit/4d023bffe8dc0f46264e1ceb815220c965481db8))
* **internal:** update comment in script ([573ef82](https://github.com/dodopayments/dodopayments-java/commit/573ef82466e8b7efbe6f6c55cda383e4498eb87d))
* update @stainless-api/prism-cli to v5.15.0 ([b35e540](https://github.com/dodopayments/dodopayments-java/commit/b35e5401c38399e9f2f4655d02a7d20acf141629))

## 1.43.2 (2025-07-25)

Full Changelog: [v1.43.1...v1.43.2](https://github.com/dodopayments/dodopayments-java/compare/v1.43.1...v1.43.2)

### Chores

* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([4b9b17c](https://github.com/dodopayments/dodopayments-java/commit/4b9b17ce94e0d30f4bc731bf50e6e10d42b09658))


### Documentation

* more code comments ([a20b681](https://github.com/dodopayments/dodopayments-java/commit/a20b6810a5e1db583d84af2b6e0b7c4de47e2e4f))

## 1.43.1 (2025-07-24)

Full Changelog: [v1.43.0...v1.43.1](https://github.com/dodopayments/dodopayments-java/compare/v1.43.0...v1.43.1)

### Documentation

* fix missing readme comment ([2ed6479](https://github.com/dodopayments/dodopayments-java/commit/2ed6479a230be9371f476f4ae8fa05924aba2d11))

## 1.43.0 (2025-07-23)

Full Changelog: [v1.42.0...v1.43.0](https://github.com/dodopayments/dodopayments-java/compare/v1.42.0...v1.43.0)

### Features

* **api:** updated openapi spec to v1.42.5 ([40d296c](https://github.com/dodopayments/dodopayments-java/commit/40d296c6b5fcbd0f05847ed3b54a6deabb331fc7))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([58db9e6](https://github.com/dodopayments/dodopayments-java/commit/58db9e65ab2b8f5a543fd0d934655175e4998053))
* **client:** add https config options ([e62e91f](https://github.com/dodopayments/dodopayments-java/commit/e62e91f30b49b1d548515e5904c379dec0d94586))
* **client:** allow configuring env via system properties ([7ae6669](https://github.com/dodopayments/dodopayments-java/commit/7ae6669f78963b09f17fc8994a614729ccd81db7))


### Bug Fixes

* **client:** ensure error handling always occurs ([db84398](https://github.com/dodopayments/dodopayments-java/commit/db84398e5076509f37c886718d556c260cbc25d4))


### Chores

* **internal:** allow running specific example from cli ([542964c](https://github.com/dodopayments/dodopayments-java/commit/542964cec07ffba7008813634cc0dee3a9214dab))
* **internal:** refactor delegating from client to options ([2782e80](https://github.com/dodopayments/dodopayments-java/commit/2782e8052ce6d589f2fa3bb7b44fb1c6771e6f14))

## 1.42.0 (2025-07-16)

Full Changelog: [v1.39.0...v1.42.0](https://github.com/dodopayments/dodopayments-java/compare/v1.39.0...v1.42.0)

### Features

* **api:** updated open api spec to v1.42.0 ([9859e1c](https://github.com/dodopayments/dodopayments-java/commit/9859e1c1f3cafb31ee628ece4e5c0579bf5b618e))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([05635a7](https://github.com/dodopayments/dodopayments-java/commit/05635a7cb46402ee5146a65c02200c3860c4e3a8))

## 1.39.0 (2025-07-15)

Full Changelog: [v1.38.1...v1.39.0](https://github.com/dodopayments/dodopayments-java/compare/v1.38.1...v1.39.0)

### Features

* **api:** updated openapi spec to v1.40.0 ([d9f6e5f](https://github.com/dodopayments/dodopayments-java/commit/d9f6e5f07334ea738c20fa3d640de1f245da1d8d))

## 1.38.1 (2025-07-09)

Full Changelog: [v1.38.0...v1.38.1](https://github.com/dodopayments/dodopayments-java/compare/v1.38.0...v1.38.1)

### Chores

* **ci:** ensure docs generation always succeeds ([c37b645](https://github.com/dodopayments/dodopayments-java/commit/c37b6455d5b4e5815e9dbacdadcb645affdc832f))

## 1.38.0 (2025-07-05)

Full Changelog: [v1.37.1...v1.38.0](https://github.com/dodopayments/dodopayments-java/compare/v1.37.1...v1.38.0)

### Features

* **api:** updated openapi spec to v1.38.0 ([19e4ded](https://github.com/dodopayments/dodopayments-java/commit/19e4ded5de318226fde829b79e6afa6b416b64dd))

## 1.37.1 (2025-07-03)

Full Changelog: [v1.37.0...v1.37.1](https://github.com/dodopayments/dodopayments-java/compare/v1.37.0...v1.37.1)

### Features

* **api:** added webhook event type model ([8df490d](https://github.com/dodopayments/dodopayments-java/commit/8df490da49d12842a55f2589d2bace66959787f2))
* **api:** added webhook payload model ([327da08](https://github.com/dodopayments/dodopayments-java/commit/327da08d66ac30ccfd6c429bd71ad5e6c41ca224))

## 1.37.0 (2025-07-02)

Full Changelog: [v1.34.2...v1.37.0](https://github.com/dodopayments/dodopayments-java/compare/v1.34.2...v1.37.0)

### Features

* **api:** updated openapi spec for v1.37.0 ([2c6be21](https://github.com/dodopayments/dodopayments-java/commit/2c6be2152780923553e59189bd88de0a75bee344))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([363bf6c](https://github.com/dodopayments/dodopayments-java/commit/363bf6c891f1c5818a7a4620cb04a557438a5b8a))
* **client:** don't close client on `withOptions` usage when original is gc'd ([4fa8683](https://github.com/dodopayments/dodopayments-java/commit/4fa8683935d28b44bee7595b024d96cfe41a8447))


### Chores

* **ci:** only run for pushes and fork pull requests ([f6f1229](https://github.com/dodopayments/dodopayments-java/commit/f6f1229ac2bca47b283182c264c2e363bea5d44f))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([149b8a3](https://github.com/dodopayments/dodopayments-java/commit/149b8a35c19ff2dc29470c86543fcc8b199b5e54))

## 1.34.2 (2025-06-24)

Full Changelog: [v1.34.1...v1.34.2](https://github.com/dodopayments/dodopayments-java/compare/v1.34.1...v1.34.2)

### Bug Fixes

* **client:** bump max requests per host to max requests (5 -&gt; 64) ([9f56229](https://github.com/dodopayments/dodopayments-java/commit/9f5622933af9576c7a5e9124438d425f8a88c98c))

## 1.34.1 (2025-06-21)

Full Changelog: [v1.34.0...v1.34.1](https://github.com/dodopayments/dodopayments-java/compare/v1.34.0...v1.34.1)

## 1.34.0 (2025-06-18)

Full Changelog: [v1.32.0...v1.34.0](https://github.com/dodopayments/dodopayments-java/compare/v1.32.0...v1.34.0)

### Features

* **api:** updated to version 1.34.0 ([6e4dd77](https://github.com/dodopayments/dodopayments-java/commit/6e4dd773e2f58c4007381756cafc38b68dea744c))
* **client:** add a `withOptions` method ([85f49ac](https://github.com/dodopayments/dodopayments-java/commit/85f49ac38b881742f7597197a06553831aafee77))
* **client:** implement per-endpoint base URL support ([23c6df7](https://github.com/dodopayments/dodopayments-java/commit/23c6df7a5b16418294b589c7046208c82d667f36))


### Chores

* **ci:** enable for pull requests ([85dd42d](https://github.com/dodopayments/dodopayments-java/commit/85dd42deb628340de3e9a403bd6d962bd265b499))

## 1.32.0 (2025-06-09)

Full Changelog: [v1.30.2...v1.32.0](https://github.com/dodopayments/dodopayments-java/compare/v1.30.2...v1.32.0)

### Features

* **api:** updated openapi spec to v1.32.0 ([39c7924](https://github.com/dodopayments/dodopayments-java/commit/39c79240ab59917fcd103be606e116f7d55ca7bd))

## 1.30.2 (2025-06-04)

Full Changelog: [v1.30.0...v1.30.2](https://github.com/dodopayments/dodopayments-java/compare/v1.30.0...v1.30.2)

### Features

* **api:** fixed openapi spec ([f4139fb](https://github.com/dodopayments/dodopayments-java/commit/f4139fbaeefa00ca57289f6d6348468a7523b7d4))

## 1.30.0 (2025-06-02)

Full Changelog: [v1.27.0...v1.30.0](https://github.com/dodopayments/dodopayments-java/compare/v1.27.0...v1.30.0)

### Features

* **api:** manual updates ([190f8d8](https://github.com/dodopayments/dodopayments-java/commit/190f8d88c314bdcf89458290bfec61e70b95cf32))


### Bug Fixes

* **client:** remove `@MustBeClosed` for future returning methods ([e8e4ad3](https://github.com/dodopayments/dodopayments-java/commit/e8e4ad3c317b690412acbba55ed5037ff666809b))


### Chores

* configure new SDK language ([15416a9](https://github.com/dodopayments/dodopayments-java/commit/15416a95857414d25d2ab74b37ca4056f97f4c29))

## 1.27.0 (2025-05-26)

Full Changelog: [v1.25.0...v1.27.0](https://github.com/dodopayments/dodopayments-java/compare/v1.25.0...v1.27.0)

### Features

* **api:** added brands api in our sdk ([b65e702](https://github.com/dodopayments/dodopayments-java/commit/b65e702174a3007d6f8655f7864c2390ac9a0275))
* **api:** updated openapi spec to 1.27.0 ([38ada5f](https://github.com/dodopayments/dodopayments-java/commit/38ada5f486987710617ad7213985bea9d962afe9))


### Chores

* **docs:** grammar improvements ([3a8afcf](https://github.com/dodopayments/dodopayments-java/commit/3a8afcffd565a7ce985ab2d801d2c0e6bb9f5115))

## 1.25.0 (2025-05-17)

Full Changelog: [v1.22.0...v1.25.0](https://github.com/dodopayments/dodopayments-java/compare/v1.22.0...v1.25.0)

### ⚠ BREAKING CHANGES

* **client:** change precision of some numeric types
* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** updated openapi spec ([a51ef84](https://github.com/dodopayments/dodopayments-java/commit/a51ef845b7a65092d7c913d9c55f394d606d0624))
* **client:** extract auto pagination to shared classes ([c6f0eb5](https://github.com/dodopayments/dodopayments-java/commit/c6f0eb551c8b15312f027f4a00987dbdf83d532f))


### Chores

* **internal:** codegen related update ([e1eaedb](https://github.com/dodopayments/dodopayments-java/commit/e1eaedbe58c7690a302737d2420724856bddbd09))
* **internal:** version bump ([5fc1e93](https://github.com/dodopayments/dodopayments-java/commit/5fc1e9325d728a35c3bc3bea363c3bceb52e69c0))


### Documentation

* remove or fix invalid readme examples ([640f15f](https://github.com/dodopayments/dodopayments-java/commit/640f15f8574b59efb1e6d80a51600a1e78b49154))


### Refactors

* **client:** change precision of some numeric types ([ccd614c](https://github.com/dodopayments/dodopayments-java/commit/ccd614cc543fdd215723a74f94dab16420e7c308))

## 1.22.0 (2025-05-09)

Full Changelog: [v1.21.0...v1.22.0](https://github.com/dodopayments/dodopayments-java/compare/v1.21.0...v1.22.0)

### Features

* **client:** allow providing some params positionally ([9160e5e](https://github.com/dodopayments/dodopayments-java/commit/9160e5e268d164c098a0e425da98b8a1f7046415))

## 1.21.0 (2025-05-09)

Full Changelog: [v1.20.0...v1.21.0](https://github.com/dodopayments/dodopayments-java/compare/v1.20.0...v1.21.0)

### Features

* **api:** fixed api key schema to bearer ([7b89fda](https://github.com/dodopayments/dodopayments-java/commit/7b89fda45087ba237be4ec72fd56398b2d7869b0))
* **api:** manual updates ([5a30d88](https://github.com/dodopayments/dodopayments-java/commit/5a30d8808f075845dbfc1030b620bdc65b7789e2))
* **api:** updated openapi spec ([9a9dd90](https://github.com/dodopayments/dodopayments-java/commit/9a9dd905334f74fc1433cc6d2af9e0d66359afd1))


### Chores

* **internal:** codegen related update ([664eec5](https://github.com/dodopayments/dodopayments-java/commit/664eec52e2dc409a3b51ff759622582b165a5ff2))
* **internal:** remove flaky `-Xbackend-threads=0` option ([4b12d25](https://github.com/dodopayments/dodopayments-java/commit/4b12d256f4f05bec9fc11d479b6bdee5d84445b3))
* **internal:** update java toolchain ([470538e](https://github.com/dodopayments/dodopayments-java/commit/470538ee1d2f98139238890f9ad3279ab95ac2ee))

## 1.20.0 (2025-05-01)

Full Changelog: [v1.19.0...v1.20.0](https://github.com/dodopayments/dodopayments-java/compare/v1.19.0...v1.20.0)

### Features

* **api:** added addons ([d675f0a](https://github.com/dodopayments/dodopayments-java/commit/d675f0a0ddf8ad5b4f7e3b56ec0c18c469080962))
* **api:** updated readme example ([a75b088](https://github.com/dodopayments/dodopayments-java/commit/a75b088fa8ac1029ad0a79acfdf78434dfb945ef))
* **api:** updated readme example ([2f54329](https://github.com/dodopayments/dodopayments-java/commit/2f543294a8f4430dda92eda1c430033dff522ae7))

## 1.19.0 (2025-04-30)

Full Changelog: [v1.18.3...v1.19.0](https://github.com/dodopayments/dodopayments-java/compare/v1.18.3...v1.19.0)

### Features

* **api:** manual updates ([605aad9](https://github.com/dodopayments/dodopayments-java/commit/605aad9727e42442310a12fb3d91b36efaee3b59))

## 1.18.3 (2025-04-25)

Full Changelog: [v1.18.1...v1.18.3](https://github.com/dodopayments/dodopayments-java/compare/v1.18.1...v1.18.3)

### Features

* **api:** manual updates ([d12f587](https://github.com/dodopayments/dodopayments-java/commit/d12f587a8dfa23adfb30ab9eeb69d9071bf8c8b4))

## 1.18.1 (2025-04-24)

Full Changelog: [v1.18.0...v1.18.1](https://github.com/dodopayments/dodopayments-java/compare/v1.18.0...v1.18.1)

### Chores

* **ci:** only use depot for staging repos ([236d5d6](https://github.com/dodopayments/dodopayments-java/commit/236d5d6461740ed9c48fab9730180902cb6fa8a9))
* **internal:** codegen related update ([dbaf975](https://github.com/dodopayments/dodopayments-java/commit/dbaf975c463d4d82eabde97b1181719b0966f56b))
* **internal:** codegen related update ([0b0c95d](https://github.com/dodopayments/dodopayments-java/commit/0b0c95da7bfa859101e356f38c1d1d4a866b46ba))

## 1.18.0 (2025-04-23)

Full Changelog: [v1.17.0...v1.18.0](https://github.com/dodopayments/dodopayments-java/compare/v1.17.0...v1.18.0)

### Features

* **api:** added change plan api ([c77af04](https://github.com/dodopayments/dodopayments-java/commit/c77af0497c6f6b10cd25975c474075e87ce7cf1f))
* **api:** manual updates ([21c8f31](https://github.com/dodopayments/dodopayments-java/commit/21c8f3189a8348c6f026dfbb66b08902f6c977a9))


### Chores

* **ci:** add timeout thresholds for CI jobs ([6d7203f](https://github.com/dodopayments/dodopayments-java/commit/6d7203f9f2cfc8775915cf5f3765aba4a5b17aa6))

## 1.17.0 (2025-04-22)

Full Changelog: [v1.16.1...v1.17.0](https://github.com/dodopayments/dodopayments-java/compare/v1.16.1...v1.17.0)

### Features

* **api:** manual updates ([a80e701](https://github.com/dodopayments/dodopayments-java/commit/a80e701d0e5d36a2d0d3ea48467a20881fa7e072))

## 1.16.1 (2025-04-18)

Full Changelog: [v1.14.2...v1.16.1](https://github.com/dodopayments/dodopayments-java/compare/v1.14.2...v1.16.1)

### Features

* **api:** manual updates ([acfb3ad](https://github.com/dodopayments/dodopayments-java/commit/acfb3ad0e9804bcd3b4ef17070afebf574653d04))


### Chores

* **internal:** codegen related update ([bfb8df9](https://github.com/dodopayments/dodopayments-java/commit/bfb8df98e0a675259f59d5c712ef22d7a03ab764))
* **internal:** version bump ([3cdab9d](https://github.com/dodopayments/dodopayments-java/commit/3cdab9d7751cd65cbd3460f7258a9c17c84665ab))

## 1.14.2 (2025-04-17)

Full Changelog: [v1.14.1...v1.14.2](https://github.com/dodopayments/dodopayments-java/compare/v1.14.1...v1.14.2)

### Chores

* **internal:** version bump ([59ad2d8](https://github.com/dodopayments/dodopayments-java/commit/59ad2d8f32fb6e3785152338ec2ca5392fd760e8))

## 1.14.1 (2025-04-17)

Full Changelog: [v1.14.0...v1.14.1](https://github.com/dodopayments/dodopayments-java/compare/v1.14.0...v1.14.1)

### Chores

* **internal:** version bump ([91daa5e](https://github.com/dodopayments/dodopayments-java/commit/91daa5e7a4f92259c4fbe3e89b87649f552d9147))

## 1.14.0 (2025-04-17)

Full Changelog: [v0.0.1-alpha.0...v1.14.0](https://github.com/dodopayments/dodopayments-java/compare/v0.0.1-alpha.0...v1.14.0)

### Features

* **api:** added publishing for ruby, java and kotlin ([df4d29d](https://github.com/dodopayments/dodopayments-java/commit/df4d29d23d9b7d3a49c9cb42b4d81fcf47570796))
* **api:** fixed openapi spec issues ([e73631d](https://github.com/dodopayments/dodopayments-java/commit/e73631d52de085149d0bd5939875a98331de7c69))
* **api:** manual updates ([8811f3f](https://github.com/dodopayments/dodopayments-java/commit/8811f3f3ccbe7806f8188f74d672bdb437ad7979))
* **api:** openapi spec updated ([1e708d7](https://github.com/dodopayments/dodopayments-java/commit/1e708d71e962ada152f629480ebfadc9c2e37936))
* **api:** updated stainless config ([1b7ec7f](https://github.com/dodopayments/dodopayments-java/commit/1b7ec7fa6b167057ab80a427568ee633e2346540))


### Chores

* configure new SDK language ([a7c4691](https://github.com/dodopayments/dodopayments-java/commit/a7c4691fea3b4ab7d89cf5df6a27052b89ed2864))
* update SDK settings ([eceb728](https://github.com/dodopayments/dodopayments-java/commit/eceb728f8c279543b045641d8d7aa5b7d9c78656))
* update SDK settings ([0df8680](https://github.com/dodopayments/dodopayments-java/commit/0df8680db539a467e195c7e74092b473bcc0ec6a))
