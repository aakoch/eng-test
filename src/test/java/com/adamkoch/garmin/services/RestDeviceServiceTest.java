package com.adamkoch.garmin.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestDeviceServiceTest {


  @Test
  void parse() {
    String responseText = "{\n"
        + "  \"_links\": {\n"
        + "    \"self\": {\n"
        + "      \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices?limit=10&offset=0\"\n"
        + "    },\n"
        + "    \"paymentDevice\": {\n"
        + "      \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices/3ea2b702-2002-459f-a36c-883d967225aa\"\n"
        + "    },\n"
        + "    \"paymentDevices\": {\n"
        + "      \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices?capabilities=SE_CONTACTLESS_PAYMENT\"\n"
        + "    }\n"
        + "  },\n"
        + "  \"limit\": 10,\n"
        + "  \"offset\": 0,\n"
        + "  \"totalResults\": 2,\n"
        + "  \"results\": [\n"
        + "    {\n"
        + "      \"_links\": {\n"
        + "        \"self\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices/8fa2eca3-787d-4916-bd7d-56aca92c1f35\"\n"
        + "        },\n"
        + "        \"user\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc\"\n"
        + "        },\n"
        + "        \"commits\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices/8fa2eca3-787d-4916-bd7d-56aca92c1f35/commits?includeAcknowledged=false&skipUpdate=false\"\n"
        + "        }\n"
        + "      },\n"
        + "      \"deviceIdentifier\": \"8fa2eca3-787d-4916-bd7d-56aca92c1f35\",\n"
        + "      \"deviceType\": \"PHONE\",\n"
        + "      \"state\": \"INITIALIZED\",\n"
        + "      \"manufacturerName\": \"Samsung\",\n"
        + "      \"deviceName\": \"engtest host device\",\n"
        + "      \"createdTs\": \"2021-02-17T17:59:19.022+0000\",\n"
        + "      \"createdTsEpoch\": 1613584759022,\n"
        + "      \"osName\": \"ANDROID\",\n"
        + "      \"cardRelationships\": []\n"
        + "    },\n"
        + "    {\n"
        + "      \"_links\": {\n"
        + "        \"self\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices/3ea2b702-2002-459f-a36c-883d967225aa\"\n"
        + "        },\n"
        + "        \"user\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc\"\n"
        + "        },\n"
        + "        \"webapp.addCredential\": {\n"
        + "          \"href\": \"https://webapp.qa.fitpay.ninja/wallet/add-card?deviceId=3ea2b702-2002-459f-a36c-883d967225aa&config={config}\",\n"
        + "          \"templated\": true\n"
        + "        },\n"
        + "        \"deviceResetTasks\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/resetDeviceTasks?userId=132fc356-a6ab-4abe-867d-86c493a607cc&deviceId=3ea2b702-2002-459f-a36c-883d967225aa\"\n"
        + "        },\n"
        + "        \"deviceStatistics\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/deviceStatistics?deviceId=3ea2b702-2002-459f-a36c-883d967225aa\"\n"
        + "        },\n"
        + "        \"commits\": {\n"
        + "          \"href\": \"https://api.qa.fitpay.ninja/users/132fc356-a6ab-4abe-867d-86c493a607cc/devices/3ea2b702-2002-459f-a36c-883d967225aa/commits?includeAcknowledged=false&skipUpdate=false\"\n"
        + "        }\n"
        + "      },\n"
        + "      \"deviceIdentifier\": \"3ea2b702-2002-459f-a36c-883d967225aa\",\n"
        + "      \"deviceType\": \"ACTIVITY_TRACKER\",\n"
        + "      \"state\": \"INITIALIZED\",\n"
        + "      \"manufacturerName\": \"FitPay\",\n"
        + "      \"deviceName\": \"engtest payment device\",\n"
        + "      \"secureElement\": {\n"
        + "        \"secureElementId\": \"BADC0FFEE000000B08F95287908A6BDF3712ACBA60A4082342722C536250723A6CD3E9B96250B8F6482E\",\n"
        + "        \"casdCert\": \"7F218202A47F218201B393102016072916110000000000001122334442038949325F200C434552542E434153442E43549501825F2504201607015F240420210701450CA000000151535043415344005314F8E1CB407F2233139DC304E40B81C21C52BFB3B35F37820100D27D99221AB06EAD71B6BC3D6008661953EBC3BD5A32C49212EFE95BDE0846632D211100AD9C67C0C8904D65823DF4AF76E73360B83943DC16A45471FBFC44E4FB254433BFE678A2E364712C3FFFF86EEB718F927DB12E8E78B3C33F980BF2CE5E333F4CFA9E9A5A3AF09CD779BEB6173D2142013B45357E6B785399C80D2C283A82EDFE8E06A72DEF4E28617700EA7CBAC02197798DA3E7E2F5C84D0F23857846DEC069553E0BCF4DB86E68B3F80C8B95053F588E47910C2BEA34D95136BA4BB4F5C41D7461062EDCD9BAF43249AA2DD005888820F5174AFC626A17C0AB326F39A095E97D99509F6DACAA61C5A31E6D1027504CC31091060111E03A8F4297E15F3850B4D8B6F9282431E1009282C23133D8025A44CC2F8CCE402B79E2A51B4EFA38E9C8A378596181B6410C5A8F7E0BB354332A93DEB40B1CACBFF1FC23B5804B52EBA1811B30E40F77CAC891F42CDCB902BF7F2181E89310201608081605268F370493B60000000142038949325F200C434552542E434153442E4354950200805F2504201607015F240420210701450CA000000151535043415344005314C0AC3B49223485BE2FCFECBC19CFE14CE01CD9797F4946B04104101E87906ADD42D19DD1BBE2E31C77C46DFA573B1765AA016B27730517AECB471372BE5855EC68FA0F4EDDA449731806630B0C55B36A03DD80613B8946006367F001005F3740301848CF8A6A80888150AFC7B3FB079671D1850B67D8A3DA5A9747E45BF51A1B49D7850853175133314A2A1DCC8D5D43B92B14E75FD5DE329A236CBEEBF1F9A5\",\n"
        + "        \"manufacturer\": \"NXP\"\n"
        + "      },\n"
        + "      \"createdTs\": \"2021-02-17T17:59:18.981+0000\",\n"
        + "      \"createdTsEpoch\": 1613584758981,\n"
        + "      \"capabilities\": [\n"
        + "        \"SE_CONTACTLESS_PAYMENT\"\n"
        + "      ],\n"
        + "      \"systemId\": \"0x123456FFFE9ABCDE\",\n"
        + "      \"lastStateTransitionReasonCode\": \"SUCCESS\",\n"
        + "      \"lastStateTransitionReasonMessage\": \"The device initialized successfully\",\n"
        + "      \"cardRelationships\": []\n"
        + "    }\n"
        + "  ]\n"
        + "}";
    RestDeviceService.parseResponse(responseText);
  }


}