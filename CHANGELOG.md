# Changelog

## 1.8.0 (2026-04-30)

Full Changelog: [v1.7.1...v1.8.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.7.1...v1.8.0)

### Features

* **api:** add pagination to external accounts list method ([fe9a790](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fe9a790d1c441a9b43d2fcb7f582f246c8289e84))


### Bug Fixes

* **types:** make accountNumber/phoneNumber/bankName optional in BDT/GHS/PKR account models ([2430c1d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/2430c1d98c1cef99f36a7fac4bf359ab670e8625))
* **types:** remove bankName, require countryOfResidence, update BDT/GTQ field optionality ([8528425](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/8528425a1497e59d7d77338163ae2bd38befd221))

## 1.7.1 (2026-04-28)

Full Changelog: [v1.7.0...v1.7.1](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.7.0...v1.7.1)

### Features

* **api:** add clientPublicKey parameter to credential resendChallenge method ([14ed1b3](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/14ed1b378fe39900f83997e7cc3d9807e41377be))
* support setting headers via env ([5796d7e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/5796d7e97c84df0fcdf449768c019d409ab1748e))


### Bug Fixes

* **types:** make clientPublicKey optional in EmailOtp/OAuth/Passkey credential verify ([8412bef](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/8412bef2530516eb4ee51b8351b4bce75c01ed28))


### Documentation

* **api:** update signing flow documentation for credentials/sessions/internal accounts ([0474f6d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/0474f6dd1bed57e9db7b5a9b4369d59c1d6d73f7))
* **types:** update IBAN field descriptions in DKK/EGP/PKR account models ([8f1b936](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/8f1b9368bcdc11e5a96c5afc7ad63c63ffbe576e))

## 1.7.0 (2026-04-27)

Full Changelog: [v1.6.0...v1.7.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.6.0...v1.7.0)

### Features

* **api:** add accountIdentifier parameter to transaction list method ([ca2725b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ca2725b3763569a0872b1ac1e572d186ed57591a))
* **api:** add auth credentials create and verify endpoints ([b036435](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/b036435c6e127fbe0dce4739b5d8dd5738610786))
* **api:** add bankName fields, add bankAccountType to GTQ, remove phoneNumber, update types ([848a5d2](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/848a5d2dc29d576b979a19ca21316e4e30a36007))
* **api:** add bankName to BDT/EGP/GHS/GTQ/JMD/PKR, GTQ bankAccountType, remove COP/GTQ/USD fields ([4ad202a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/4ad202ab7ee7e5ec713a575bca06e833056da4a9))
* **api:** add COMPANY_LEGAL_NAME to CustomerInfoFieldName ([087693a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/087693af0b9e004bf8d96ada03cb938a4450ea0e))
* **api:** add credentials create/verify/resend methods to auth resource ([a3673a8](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/a3673a8140966cc08ba97e0c66601a41d6399f87))
* **api:** add email field to customer models ([062a7ab](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/062a7abcaf0d660a97ec01bf48ccdbbafd4f36eb))
* **api:** add gridWalletSignature parameter and EmbeddedWallet type to quotes ([2664f0b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/2664f0bf301f98cd62d3b7e6279f9df8da8f9325))
* **api:** add internal_accounts/export, auth/sessions, auth/credentials list/revoke endpoints ([3507805](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/35078057a67dca522905a1ba49d417ad8e3803cb))
* **api:** add list and revoke methods to credentials ([d460c5c](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/d460c5c8508aa43f589098a5e5dc863c62032e30))
* **api:** add list method to auth credentials ([f1af309](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/f1af3092e5b0dcceda155e65db20e85072c9c80e))
* **api:** add list sessions to auth, list/revoke methods to credentials ([6158a20](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6158a203be729f3bd93d4dd0c168c7d2a313e684))
* **api:** add OAuth credential type and oidcToken param to credential create ([1a89c75](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1a89c75623a201693f3512fc0183dab5e0ac46f4))
* **api:** add passkey credential support to credentials ([22cc69b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/22cc69b75555c4b6e56935e1010da8a93c9ad597))
* **api:** add passkey support to credentials verify method ([a2b583d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/a2b583dc807f244dc50517de3e9a76fcf2fee931))
* **api:** add required clientPublicKey parameter to internal accounts export method ([4bb1334](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/4bb1334724411595f23ad6257ab0990503c50826))
* **api:** add resendChallenge method to credentials ([9368a26](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/9368a263d80872773d80490dff25ef59864e0cb3))
* **api:** add retrieve/update/delete to customers/platform external accounts ([602b49d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/602b49dec83c14511c09a86cbbc8d370e91b677f))
* **api:** add session field to CredentialVerifyResponse ([f2d9c62](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/f2d9c626154e73c1d3fcfa477ffeded68fe2b920))
* **api:** add sessions resource, list/revoke methods to credentials ([6140095](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6140095db2c785df8ec9572cd21aa0632aff77a5))
* **api:** add type field to InternalAccount ([44d8154](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/44d81547c2171b0ca57f0f9986acdadf25557e25))
* **api:** add type parameter to customer/platform list internal accounts ([501b3c5](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/501b3c5fa222a68ae2960f29686ad8d81d85351d))
* **api:** manual updates ([9a5ff6e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/9a5ff6ee35c1ed86d86883352079f31e78806a7c))
* **api:** remove update method from customers/platform external accounts ([1c02d44](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1c02d445c9eb42eb577f56ba9b22b1380377663d))
* **types:** add phoneNumber/bankAccountType, remove bankName, update beneficiary fields ([afceef2](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/afceef2216014fa8089881231ea566294aa00140))
* **types:** convert CredentialResendChallengeResponse to AuthMethod/PasskeyAuthChallenge union ([3bd7203](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/3bd720328e2205851e205335f47898cc2404c464))


### Documentation

* **api:** clarify customerId parameter documentation in transactions ([69a6031](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/69a6031d6b491ca68edf340917f6dec4dd68b708))

## 1.6.0 (2026-04-17)

Full Changelog: [v1.5.0...v1.6.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.5.0...v1.6.0)

### Features

* Add COL payment instructions to grid_api ([7cc62ba](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/7cc62bae78b06587c390f75307837d2e0ada1298))
* **api:** add ArsAccount variant to AccountOrWalletInfo ([6dd1ee3](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6dd1ee3d26ec2c761049887e2f1a1e7afdbd423e))
* **api:** manual updates ([07defd3](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/07defd3dd6303ee32a0d4bdfa905893ea6abc2a3))
* **api:** manual updates ([544c451](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/544c451aed4a3cb03632531e7b93bd0408b99873))
* **api:** manual updates ([db652f0](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/db652f02171b3ed20f10ed155c201fc0bb1fd6d4))
* fix mispelling of identification type enum ([a899b75](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/a899b7500952a39d4c804beaec3ff2bab04f16be))
* Split request and response schemas for external account paymentRails ([e6c10c6](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/e6c10c679ea795b11c02f0c5d026458f87fa6316))


### Bug Fixes

* **types:** change payment rail fields to enum in exchange rates/quotes ([be60620](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/be60620f6c605005b7d863c36b7c1c55f8824f76))
* **types:** make platformCustomerId optional in customer create types ([a87e16e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/a87e16e13be57cc29ad5c8163a5280867d98e936))


### Chores

* **ci:** remove release-doctor workflow ([955f921](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/955f92164b792446704c0f2148f36fbc4929397a))
* **internal:** regenerate SDK with no functional changes ([d687510](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/d687510e47d3867323e70c31d41dd1005d2cbb79))

## 1.5.0 (2026-04-10)

Full Changelog: [v1.4.0...v1.5.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.4.0...v1.5.0)

### Features

* **api:** add currencies/region fields to customers, filters to list ([87d9221](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/87d922160615f1ad5f59083ceb4a2bcb0259d1bd))
* **api:** remove list method from quotes ([ae6b4e8](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ae6b4e838f052ee945ddfdb2f31b4b7a7113a36b))


### Bug Fixes

* **api:** make customerId required, remove role filter in beneficial owners list ([ffa8a25](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ffa8a255d98c3baff944a23b615a51a1d5335749))


### Documentation

* **api:** update crypto_network examples in crypto/external accounts/quotes ([149bfc9](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/149bfc98f9014beb590f47c75983c4b6b9250514))

## 1.4.0 (2026-04-01)

Full Changelog: [v1.3.0...v1.4.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.3.0...v1.4.0)

### Features

* **api:** add discoveries resource ([12df4dc](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/12df4dc411a9b37d9f801bd0c59bfbddc482a538))
* **api:** add READY_FOR_VERIFICATION status/webhook event, 10 error types to verifications ([09d181a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/09d181af1965b28c27cdb47ebce90d42ed11ac60))
* **api:** manual updates ([9422fcc](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/9422fcca46491a81974e7c79e0d692ba8660f823))
* **api:** manual updates ([c814c1e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c814c1ef5a36c09508a8d7bf574fa8b150de15ba))
* **api:** remove createLinkToken and submitPublicToken methods from plaid ([d850b83](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/d850b8326a0c8be08ef8dd2f7d9ba48e63db74f5))
* **api:** remove external account details destination from quotes and transactions ([598dd8b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/598dd8b0a34af1ee0195f1fa1b20971431789d1a))
* Move timeout to refund reason ([e7460ef](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/e7460ef37adb8ac690cbe4140a5d0edce364ad40))


### Chores

* Sync account schemas ([047b627](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/047b6272157a2ee1aeda574903d097e44cbf0f84))

## 1.3.0 (2026-03-25)

Full Changelog: [v1.2.0...v1.3.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.2.0...v1.3.0)

### Features

* adding kyb schema ([b118a5c](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/b118a5c36445d096f20d5ac8efae990d130a12a2))
* **api:** add ethereum wallet to external accounts and payment instructions ([df20d5b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/df20d5b7825439fd3fee57c67eec74dddd759ace))
* **api:** add qrCode and reference fields to BRL payment instructions ([ac48125](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ac481255b13aaf1ae6f70553018b793a4c735f8d))
* **api:** add VERTICAL to CustomerInfoFieldName enum ([ecf38f9](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ecf38f9d8aa4292a769decb53c646b4506e6e501))
* **api:** replace MISSING_DOCUMENT with category-specific error types in verifications ([4b0241a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/4b0241adecda98946a18e381beefa3f98c865ea6))
* **api:** restructure BeneficialOwner in customers with personalInfo, roles, kycStatus ([c0ef57b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c0ef57bf8cc2c4f65a35c5e2386c58857c72ea76))


### Bug Fixes

* **tests:** update transaction count/volume enum values in business customer tests ([c5480b8](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c5480b882976d7bf93675a86bb049585d927dbe8))
* **types:** change purposeOfAccount to enum in BusinessInfo/BusinessCustomerFields ([cbbb1a1](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/cbbb1a10a32a89ab806a38600469d0a400ffdf37))
* **types:** make ownershipPercentage required/Long, flatten PersonalIds in beneficial_owners ([ab09a3a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ab09a3a41f566b2d1063f1afb4a17d75c4558223))
* **types:** remove beneficialOwners field, flatten expectedActivityVolumes in BusinessInfo ([772768d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/772768de48bc99597d52dad902ae89ce7dbb325c))


### Chores

* **ci:** skip lint on metadata-only changes ([83f3f4a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/83f3f4a58cdbb87f6867a3037e370404ea32f412))
* **internal:** bump ktfmt ([201b5a2](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/201b5a20fdcfa045f0495f179cef4f412e889f58))
* **internal:** update gitignore ([6cea291](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6cea29138938d80d2057fb887fb528b4787e5c9b))

## 1.2.0 (2026-03-19)

Full Changelog: [v1.1.0...v1.2.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.1.0...v1.2.0)

### Features

* **api:** add AED account, fix BRL pixKeyType enum, rename swiftBic to swiftCode ([c624a8b](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c624a8bc07bbed3296f0c94a285a0d857bb4d2c5))
* **api:** add BWP/XAF accounts, remove countries from MWK/UGX/XOF, add region to XOF ([60a0875](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/60a087501ef1970ddd657413a1d9868dab75a9e8))
* **api:** add counterpartyInformation to Quote, remove from UmaAddressDestination ([7bc8f5e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/7bc8f5eca99953c8b77cd9feefb760b94867fa24))
* **api:** add paymentRail field to AccountDestination in quotes ([5ba332e](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/5ba332e43e39f5c251f4812d703082d66e4aa625))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([9c80bef](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/9c80bef065e35888619c2e630ec93d0a6e78636d))


### Chores

* **internal:** codegen related update ([5051a7f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/5051a7f0de20065d13f6b9d21399ddb4fc040673))
* **internal:** tweak CI branches ([6e09328](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6e09328b8e8a4138d5499623b133225fdd2c540d))
* **internal:** update retry delay tests ([4b82d70](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/4b82d70ddfcd36d3e45377945b42c381b20515df))


### Documentation

* **api:** remove sandbox testing details from external accounts and quotes ([690fedd](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/690fedd88a4fa4ecaf56813e0fb4715c1377a876))
* **api:** update senderCustomerInfo parameter documentation in quotes ([9fd4115](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/9fd4115ba002ada89663384b386f9504079a7db2))

## 1.1.0 (2026-03-11)

Full Changelog: [v1.0.0...v1.1.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v1.0.0...v1.1.0)

### Features

* **api:** add crypto service, cryptoNetwork to external accounts ([414443f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/414443fabcdaf9bee5077142701893f83bdc4d57))


### Bug Fixes

* **client:** incorrect `Retry-After` parsing ([373ed84](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/373ed8488b434c9de1eaf0a6d3aa96b788da22e6))


### Chores

* update placeholder string ([6563a30](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6563a308b4fad12fc31f7f174d4f71f761f64cb8))

## 1.0.0 (2026-03-07)

Full Changelog: [v0.10.0...v1.0.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.10.0...v1.0.0)

### Chores

* move to 1.0.0 ([50c15f2](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/50c15f2a8f41dfdb96af2f4f01255c92cd18bfab))

## 0.10.0 (2026-03-06)

Full Changelog: [v0.9.0...v0.10.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.9.0...v0.10.0)

### Features

* add cryptoNetwork field to RealtimeFundingQuoteSource ([e59a691](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/e59a691cf416def6afd55ed1028606c313be0ec5))
* Add support for MWK, UGX, and XOF currency accounts ([1877d74](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1877d7439f3f66da9440e3391b1ea4b622427f6d))
* **api:** add kyb webhooks/status fields, remove kyc from response, update webhook data types ([df71de8](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/df71de8c00a69422dde09d7e015506c4962dbd8e))
* **api:** adding webhooks back in ([41235f5](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/41235f546886c3ec5b98bf4878fa15fd46d77708))
* **api:** manual updates ([1c59bac](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1c59bac7b16ab9dc2f1bc45d66fcda886dad686b))
* **api:** manual updates ([b90ab5f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/b90ab5f29684f6e09b5a0175d8f0a58a9d12f42e))
* **api:** manual updates ([d18b45f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/d18b45f8c2d9407c0e578a7d546dd6f7150c654a))
* **api:** manual updates ([d639af1](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/d639af18be17f14c272dbd6fd145c7d7f9c778b8))
* **api:** manual updates ([ddc9c97](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ddc9c97fa1de714d1b0167aee5560fd73dfadd59))
* **api:** manual updates ([ee71f3c](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ee71f3ca267fa194fc2889a78c6ebcb469c11fcd))
* **api:** manual updates ([3dd9539](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/3dd9539e2171c16395f86c470f93da7abac2c0bd))
* **api:** manual updates ([71a3b7d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/71a3b7dfc284d3a199e2d926d758aa36ff942c9c))
* cleaning up webhooks ([ac6bac0](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ac6bac071cd287b68b823781194b4857fa085a11))


### Bug Fixes

* **types:** remove SENT status from TransactionStatus ([01ceda0](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/01ceda067bebbccbc4e002fc8aecfa06dc98dd99))


### Chores

* **internal:** bump palantir-java-format ([5d51288](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/5d51288256be3e4317e98e425e04b3dafd863e98))
* **internal:** codegen related update ([d419945](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/d41994522629078645040ef4b2f962858e6063b7))
* **internal:** codegen related update ([3f825d9](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/3f825d931c7084b4b84e3b4cfa92b998f863806e))

## 0.9.0 (2026-03-03)

Full Changelog: [v0.8.0...v0.9.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.8.0...v0.9.0)

### Features

* **api:** manual updates ([cd338d7](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/cd338d7a2303ca5810324918f4e89d6b5c3b6353))
* **api:** manual updates ([b82c77f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/b82c77fbb75abe9fb12535b59fbe371cd5bb628b))
* **api:** manual updates ([8828272](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/882827280a7b762c191cb738824666c3eec8801b))
* **api:** manual updates ([fbedc3a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fbedc3a94355c408cc77a3eaf78786e4e7d537db))
* **types:** remove IMPS payment rail from InrExternalAccountInfo and PaymentInstructions ([1a8cea2](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1a8cea20e685832c9a6051f024575505f7c61264))

## 0.8.0 (2026-02-27)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.7.0...v0.8.0)

### Features

* Add ZAR KES TSZ ZMW RWF account beneficiary information for grid ([c49254f](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/c49254f80e29ad3b5d6c9a6fa27b62df68c78b2d))
* **api:** add swiftCode to HKD/MYR/THB/VND, add bankName/phoneNumber to IDR accounts ([1a7a750](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/1a7a7509da4896f4e26dab2d1bbeed20da43f275))


### Bug Fixes

* **types:** remove countries field from external account models ([6428485](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/642848508b7493e629046829298038e8c1a4828b))


### Chores

* **tests:** update external account test fixtures from BRL to USD ([6293cb6](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/6293cb6a534a2eafa35ddab914efdd553a8f5976))

## 0.7.0 (2026-02-25)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/lightsparkdev/grid-kotlin-sdk/compare/v0.6.0...v0.7.0)

### Features

* **api:** add CAD/NGN account types to external accounts ([30ce46a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/30ce46ae4e41ab1b0646bc56fbf70afa1d21565c))
* **api:** add purposeOfPayment parameter to quote create ([19289e0](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/19289e04c279a12e4b5ba86e32b0aa7dff9f2996))
* **api:** add type discriminators to transactions, union response types for operations ([179e149](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/179e1499aea1e2255e3b519e62499a2559ff94eb))
* **client:** add connection pooling option ([69d826d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/69d826da7a3cd347e9e03805ab64d3307dc29591))
* **client:** add more convenience service method overloads ([018b818](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/018b818d4ef2679406527b2d30f08a7f1225b11a))
* External Accounts Updates ([53636a3](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/53636a3f7bd0323dfd97dd55e69ed1a92297833c))


### Bug Fixes

* **api:** flatten external account create parameters ([812c7d1](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/812c7d16e9a8b3855635fff7dc361d9b071edeff))
* **api:** rename jobId/quoteId/webhookId to id in quotes/webhooks/bulk ([4b2c78c](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/4b2c78c4f92c04db90ce3c67371f0dd5e4dd49c2))
* **types:** consolidate customers delete/retrieve/update response types to CustomerOneOf ([975a233](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/975a233af7d07c9b68f6a7546f07fc7efa05ef80))


### Chores

* drop apache dependency ([ddbd26a](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/ddbd26a46acb21d9adfd0908b36f7bccebced20c))
* **internal:** expand imports ([f6aa5cd](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/f6aa5cd23c56eaebe8e6281fc862d6e86d163c3f))
* **internal:** make `OkHttp` constructor internal ([fb4641d](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/fb4641d9073671845d7a597dced8daf1ea09e5b1))
* **internal:** remove mock server code ([cb022ef](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/cb022ef9a8309e1917970c280575c2924642d9b0))
* make `Properties` more resilient to `null` ([0f09e80](https://github.com/lightsparkdev/grid-kotlin-sdk/commit/0f09e8069b345bdefffa065b62155daa1a134344))
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
