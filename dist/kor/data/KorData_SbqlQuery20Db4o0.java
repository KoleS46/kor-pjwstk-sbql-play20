package kor.data;

import com.db4o.*;

import com.db4o.foundation.*;

import com.db4o.internal.*;
import com.db4o.internal.btree.*;

import kor.model.Class;
import kor.model.Professor;
import kor.model.Student;

import org.apache.commons.collections.CollectionUtils;

import pl.wcislo.sbql4j.db4o.*;
import pl.wcislo.sbql4j.exception.*;
import pl.wcislo.sbql4j.java.model.runtime.*;
import pl.wcislo.sbql4j.java.model.runtime.Struct;
import pl.wcislo.sbql4j.java.model.runtime.factory.*;
import pl.wcislo.sbql4j.java.utils.ArrayUtils;
import pl.wcislo.sbql4j.java.utils.OperatorUtils;
import pl.wcislo.sbql4j.java.utils.Pair;
import pl.wcislo.sbql4j.lang.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.codegen.simple.*;
import pl.wcislo.sbql4j.lang.db4o.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.interpreter.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.parser.expression.*;
import pl.wcislo.sbql4j.lang.parser.expression.OrderByParamExpression.SortType;
import pl.wcislo.sbql4j.lang.parser.terminals.*;
import pl.wcislo.sbql4j.lang.parser.terminals.operators.*;
import pl.wcislo.sbql4j.lang.types.*;
import pl.wcislo.sbql4j.lang.xml.*;
import pl.wcislo.sbql4j.model.*;
import pl.wcislo.sbql4j.model.collections.*;
import pl.wcislo.sbql4j.util.*;
import pl.wcislo.sbql4j.util.Utils;
import pl.wcislo.sbql4j.xml.model.*;
import pl.wcislo.sbql4j.xml.parser.store.*;

import java.util.*;


public class KorData_SbqlQuery20Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery20Db4o0() {
    }

    /**
     * query='db.( all Professor getMarried())'
    '
     **/
    public java.lang.Boolean executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta31 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids31 = _classMeta31.getIDs(transLocal);

        for (long _id31 : _ids31) {
            LazyObjectReference _ref31 = transLocal.lazyReferenceFor((int) _id31);
            _ident_Professor.add((kor.model.Professor) _ref31.getObject());
        }

        java.lang.Boolean _allResult = true;
        Integer _allIndex = 0;

        for (kor.model.Professor _allEl : _ident_Professor) {
            if (_allEl != null) {
                ocb.activate(_allEl, 1);
            }

            java.lang.Boolean _mth_getMarriedResult = _allEl.getMarried();

            if (_mth_getMarriedResult != null) {
                ocb.activate(_mth_getMarriedResult, 1);
            }

            if (!_mth_getMarriedResult) {
                _allResult = false;

                break;
            }
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_allResult, ocb);

        return _allResult;
    }
}
