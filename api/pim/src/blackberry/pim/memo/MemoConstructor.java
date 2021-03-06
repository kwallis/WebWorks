/*
* Copyright 2010-2011 Research In Motion Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package blackberry.pim.memo;

import blackberry.core.ScriptableFunctionBase;

/**
 * This class represents the constructor of a Memo
 * 
 * @author dmateescu
 */
public class MemoConstructor extends ScriptableFunctionBase {
    public static final String NAME = "blackberry.pim.Memo";

    private MemoFindScriptableFunction _find;

    /**
     * Default constructor
     */
    public MemoConstructor() {
        super();
        _find = new MemoFindScriptableFunction();
    }

    /**
     * @see net.rim.device.api.script.ScriptableFunction#construct(java.lang.Object, java.lang.Object[])
     */
    public Object construct( final Object thiz, final Object[] args ) throws Exception {
        return new MemoObject();
    }

    /**
     * @see net.rim.device.api.script.Scriptable#getField(java.lang.String)
     */
    public Object getField( String name ) throws Exception {
        if( name.equals( MemoFindScriptableFunction.NAME ) ) {
            return _find;
        }
        return UNDEFINED;
    }

    /**
     * @see blackberry.core.ScriptableFunctionBase#execute(java.lang.Object, java.lang.Object[])
     */
    protected Object execute( Object thiz, Object[] args ) throws Exception {
        return UNDEFINED;
    }
}
