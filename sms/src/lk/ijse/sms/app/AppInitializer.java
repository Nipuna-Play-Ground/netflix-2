package lk.ijse.sms.app;

import com.netflix.ribbon.api.*;
import com.netflix.zuul.service.ApiGateway;
import com.netflix.zuul.service.RandomService;

import java.util.Base64;

public class AppInitializer {
    ApiGateway apiGateway;
    RandomService randomService;
    RibbonGateway ribbonGateway;
    RibbonService ribbonService;
}
