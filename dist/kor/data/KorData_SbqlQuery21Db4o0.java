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


public class KorData_SbqlQuery21Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery21Db4o0() {
    }

    /**
     * query='db.((!( any Student getMarried())) group as _aux0).(Student as s where s.getPromoter().getMarried() == _aux0)'
    '
     **/
    public java.util.Collection<kor.model.Student> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta32 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids32 = _classMeta32.getIDs(transLocal);

        for (long _id32 : _ids32) {
            LazyObjectReference _ref32 = transLocal.lazyReferenceFor((int) _id32);
            _ident_Student.add((kor.model.Student) _ref32.getObject());
        }

        java.lang.Boolean _anyResult = false;
        Integer _anyIndex = 0;

        for (kor.model.Student _anyEl : _ident_Student) {
            if (_anyEl != null) {
                ocb.activate(_anyEl, 1);
            }

            java.lang.Boolean _mth_getMarriedResult = _anyEl.getMarried();

            if (_mth_getMarriedResult != null) {
                ocb.activate(_mth_getMarriedResult, 1);
            }

            if (_mth_getMarriedResult) {
                _anyResult = true;

                break;
            }
        }

        java.lang.Boolean _notResult = !_anyResult;
        java.lang.Boolean _groupAsResult_aux0 = _notResult;
        java.lang.Boolean _dotEl2 = _groupAsResult_aux0;
        final java.util.Collection<kor.model.Student> _ident_Student1 = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta33 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids33 = _classMeta33.getIDs(transLocal);

        for (long _id33 : _ids33) {
            LazyObjectReference _ref33 = transLocal.lazyReferenceFor((int) _id33);
            _ident_Student1.add((kor.model.Student) _ref33.getObject());
        }

        java.util.Collection<kor.model.Student> _asResult_s = _ident_Student1;
        java.util.Collection<kor.model.Student> _whereResult = new java.util.ArrayList<kor.model.Student>();
        int _whereLoopIndex = 0;

        for (kor.model.Student _whereEl : _asResult_s) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            kor.model.Student _ident_s = _whereEl;

            if (_ident_s != null) {
                ocb.activate(_ident_s, 1);
            }

            kor.model.Student _dotEl = _ident_s;

            if (_ident_s != null) {
                ocb.activate(_ident_s, 2);
            }

            kor.model.Professor _mth_getPromoterResult = _dotEl.getPromoter();

            if (_mth_getPromoterResult != null) {
                ocb.activate(_mth_getPromoterResult, 1);
            }

            kor.model.Professor _dotEl1 = _mth_getPromoterResult;

            if (_mth_getPromoterResult != null) {
                ocb.activate(_mth_getPromoterResult, 2);
            }

            java.lang.Boolean _mth_getMarriedResult1 = _dotEl1.getMarried();

            if (_mth_getMarriedResult1 != null) {
                ocb.activate(_mth_getMarriedResult1, 1);
            }

            java.lang.Boolean _ident__aux0 = _dotEl2;
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getMarriedResult1,
                    _ident__aux0);

            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_whereResult, ocb);

        return _whereResult;
    }
}
