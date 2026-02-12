# Changelog

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
