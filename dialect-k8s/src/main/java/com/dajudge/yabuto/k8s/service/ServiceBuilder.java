package com.dajudge.yabuto.k8s.service;

import com.dajudge.yabuto.k8s.base.RootObjectBuilder;
import com.dajudge.yabuto.k8s.shared.PortBuilder;

public class ServiceBuilder extends RootObjectBuilder<ServiceBuilder> {
    public ServiceBuilder(final String name) {
        super("Service", "v1", name);

        me().child("spec")
                .simpleValue("type", "type", null, String.class)
                .keyValuePairs("selector", "selector")
                .builderList("port", "ports", (args) -> new PortBuilder());
    }

}
