# Changelog

## 0.7.0 (2026-02-20)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.6.0...v0.7.0)

### Features

* **api:** add purposeOfPayment parameter to quote create ([19289e0](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/19289e04c279a12e4b5ba86e32b0aa7dff9f2996))
* **api:** add type discriminators to transactions, union response types for operations ([179e149](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/179e1499aea1e2255e3b519e62499a2559ff94eb))
* **client:** add connection pooling option ([69d826d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/69d826da7a3cd347e9e03805ab64d3307dc29591))
* **client:** add more convenience service method overloads ([018b818](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/018b818d4ef2679406527b2d30f08a7f1225b11a))


### Bug Fixes

* **api:** rename jobId/quoteId/webhookId to id in quotes/webhooks/bulk ([4b2c78c](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/4b2c78c4f92c04db90ce3c67371f0dd5e4dd49c2))


### Chores

* **internal:** make `OkHttp` constructor internal ([fb4641d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fb4641d9073671845d7a597dced8daf1ea09e5b1))
* **internal:** remove mock server code ([cb022ef](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/cb022ef9a8309e1917970c280575c2924642d9b0))
* update mock server docs ([fce08b1](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fce08b189c0bec585829fb8b46eff071363c13a2))


### Documentation

* **api:** clarify immediately_execute parameter in quotes ([7a900ba](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/7a900ba9000ca40901aa2f0d2d553cad268482c7))

## 0.6.0 (2026-02-19)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.5.0...v0.6.0)

### Features

* adding external account validation schema ([55b822f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/55b822f28d1bdcf5dcae613586c4b4402f2fa909))
* adding helper methods for currencyutils and webhook signature verification ([18be30b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/18be30bd4e30cdf54f00011c79f31cd743ffd5fa))
* **api:** manual updates ([bb38b12](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/bb38b12a623119f4b0d4cd5d37ea9ff58ac41772))
* **api:** manual updates ([6750b40](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6750b40c1d2f5e86e857796fc208d73bd9f9c170))
* **api:** manual updates ([f0b71ed](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/f0b71edbe652fd3548873defd64430172b265478))
* **api:** manual updates ([2fe87f9](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/2fe87f989e6a767317f85b67f18254103db1a9dd))
* **api:** remove originalQuoteId field from Quote model ([56c0a2e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/56c0a2e993021a766f0229d1d21bbea559678a07))
* **api:** remove originalTransactionId from SandboxSendFundsResponse ([c4d6495](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c4d64957499cfaaefc43101c5660f409e5b6f008))
* Revert main to af3a51a ([be6031b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/be6031b30f6db3d202155b76eb653393761a39f9))


### Chores

* **internal:** update `TestServerExtension` comment ([8e4eb16](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/8e4eb16dd1e9407fa7338d3d2ab2af013c96b75a))

## 0.5.0 (2026-02-12)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.4.0...v0.5.0)

### Features

* **api:** add webhook events/unwrap, move test webhook to sandbox, update transaction types ([1f4fd99](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1f4fd99825afb16bb22dc90be737ccbbc6a5e519))

## 0.4.0 (2026-02-12)

Full Changelog: [v0.3.1...v0.4.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.3.1...v0.4.0)

### Features

* **api:** fix package names ([6fdce75](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6fdce75b4db56c58193e627d0f47b4e5219e6e0b))
* **api:** manual updates ([fb13f2e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fb13f2e4e664b5dccc1da4c5f69983cd36d4586a))
* **api:** set release_environment to npm ([0307ccb](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/0307ccb8a234d080604d4effa567122d4e2cfeb4))


### Chores

* update SDK settings ([68bd41b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/68bd41b29139764a041c397a78bb2aecbda8a534))

## 0.3.1 (2026-02-11)

Full Changelog: [v0.3.0...v0.3.1](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.3.0...v0.3.1)

### Chores

* update SDK settings ([3fa02cd](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/3fa02cdf0597fd486c84a1613d0d08bf92b9fcf4))

## 0.3.0 (2026-02-10)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.2.0...v0.3.0)

### Features

* adding min and max to fx api ([8eb3d65](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/8eb3d65a6c8f13dc31ba18b713dd341c2adf91a7))
* **api:** manual updates ([2aa88b8](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/2aa88b8cdb9d358aa6d36efef5cd58356f5f390e))


### Chores

* configure new SDK language ([e8b921b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/e8b921bd2ba2c7d77682a25864e61743916f13a9))

## 0.2.0 (2026-02-10)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.1.0...v0.2.0)

### Features

* **api:** remove reference to empty base objects ([08ceeb9](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/08ceeb90cc686cf7d11ed1e8fb137baa9f2739af))
* updating stainless.yml to publish to maven ([f7e44a6](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/f7e44a6491b911054d34f0f1f807e2666da28c8e))

## 0.1.0 (2026-02-09)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.0.1...v0.1.0)

### Features

* add isPlatformAccount to PaymentInstructions and remove PaymentAccountOrWalletInfo refs ([#128](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/128)) ([f05d11f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/f05d11f0723d0740d2f63b6e1081f9c8ace7db9f))
* add Stainless SDK config and misc cleanups ([#132](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/132)) ([30fbd62](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/30fbd62214cba0ac4faac93ba3a04920526f1497))
* adding API design guidelines ([#137](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/137)) ([defc948](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/defc94817444b3c52c6c9ad6dbc7389c29f96783))
* adding idempotency to transfers ([#138](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/138)) ([e84817d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/e84817d8346ef5f55ac0cb37e93d2b16e5ca3a2e))
* **api:** manual updates ([27f7017](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/27f7017f04615efaa0d92eec34db15b6611055f6))
* **api:** manual updates ([14b61b0](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/14b61b071b024885ae97250103d84ea289a0d39c))
* **api:** updating package names ([eaebf77](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/eaebf77873cba88bf672e44d9b8eb91de6071d84))
* convert single-value enums to const for base types ([#126](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/126)) ([fc8dd03](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fc8dd03497dec0dde3685292e7580d7089b62052))
* rename accounts to data in list external accounts response ([#127](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/127)) ([10fa3eb](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/10fa3eb4762d6962658ef9c61ea9be22964ca81a))
* rename Error to GridError and add additionalProperties to error schemas ([#131](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/131)) ([c9ec7a2](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c9ec7a2ba5caa5a83b3659b73cdb3561b05b1752))


### Bug Fixes

* adding type:string to const discriminators ([#139](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/139)) ([fe683e6](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fe683e6f4f6e7990b2bacee9566a4f76e2660b17))
* reverting back to using enums instead of const for openapi generator ([#140](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/140)) ([1df8211](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1df82118b36bf3c189d03c9d41b574fb49cd7bc3))
* separating create customer from customer response schemas ([#142](https://github.com/lightsparkdev/grid-kotlin-sdk/issues/142)) ([dde72cc](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/dde72ccbb05208db717e20d48b56225070aba03b))


### Chores

* sync repo ([865f8bb](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/865f8bb5360ca0f140185eae5546ce413ceca6be))
* update SDK settings ([0ca6e35](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/0ca6e3566baccd2625c1157f02b459d71a80d8b6))
