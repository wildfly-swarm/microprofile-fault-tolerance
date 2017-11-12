package org.wildfly.swarm.microprofile.fault.tolerance.hystrix;

import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;

public class StringFallbackHandler implements FallbackHandler<String> {
    @Override
    public String handle(ExecutionContext context) {
        return "fallback for " + context.getMethod().getName();
    }
}

