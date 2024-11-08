package org.custom;

import org.kie.kogito.internal.process.runtime.KogitoProcessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.kie.kogito.serverless.workflow.models.JsonNodeModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SendJar {

    //private static final Logger logger = LoggerFactory.getLogger(SendJar.class);

    @Inject
    ObjectMapper objectMapper;

    public void printKogitoProcessId(String url) {
        System.out.println("In Java class " + url);
        
        //logger.info("Workflow data {}, KogitoProcessInstanceId {} ", workflowData, context.getProcessInstance().getStringId());
        System.out.println("OUT of JAVA class");
    }


}    