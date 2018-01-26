/*******************************************************************************
 * Copyright (c) 2018 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.kura.internal.wire.math.multiport.division;

import org.eclipse.kura.internal.wire.math.multiport.AbstractDualportMathComponent;
import org.eclipse.kura.type.TypedValue;
import org.eclipse.kura.type.TypedValues;

public class DivisionComponent extends AbstractDualportMathComponent {

    @Override
    public TypedValue<?> apply(TypedValue<?> t, TypedValue<?> u) {
        double firstOperand = ((Number) t.getValue()).doubleValue();
        double secondOperand = ((Number) u.getValue()).doubleValue();
        return TypedValues.newDoubleValue(firstOperand / secondOperand);
    }
}
