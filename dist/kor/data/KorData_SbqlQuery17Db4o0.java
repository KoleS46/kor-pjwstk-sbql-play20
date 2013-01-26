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


public class KorData_SbqlQuery17Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery17Db4o0() {
    }

    /**
     * query='db.( avg(Professor.getAge()) group as _aux0).(Professor as p where p.getAge() > _aux0).p'
    '
     **/
    public java.util.Collection<kor.model.Professor> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta24 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids24 = _classMeta24.getIDs(transLocal);

        for (long _id24 : _ids24) {
            LazyObjectReference _ref24 = transLocal.lazyReferenceFor((int) _id24);
            _ident_Professor.add((kor.model.Professor) _ref24.getObject());
        }

        java.util.Collection<java.lang.Integer> _dotResult = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex = 0;

        for (kor.model.Professor _dotEl : _ident_Professor) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            java.lang.Integer _mth_getAgeResult = _dotEl.getAge();

            if (_mth_getAgeResult != null) {
                ocb.activate(_mth_getAgeResult, 1);
            }

            if (_mth_getAgeResult != null) {
                ocb.activate(_mth_getAgeResult, 1);
            }

            _dotResult.add(_mth_getAgeResult);
            _dotIndex++;
        }

        java.lang.Double _avgResult = 0d;

        if ((_dotResult != null) && !_dotResult.isEmpty()) {
            Number _avgSum0 = null;

            for (Number _avgEl0 : _dotResult) {
                _avgSum0 = MathUtils.sum(_avgSum0, _avgEl0);
            }

            _avgResult = _avgSum0.doubleValue() / _dotResult.size();
        }

        java.lang.Double _groupAsResult_aux0 = _avgResult;
        java.lang.Double _dotEl2 = _groupAsResult_aux0;
        final java.util.Collection<kor.model.Professor> _ident_Professor1 = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta25 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids25 = _classMeta25.getIDs(transLocal);

        for (long _id25 : _ids25) {
            LazyObjectReference _ref25 = transLocal.lazyReferenceFor((int) _id25);
            _ident_Professor1.add((kor.model.Professor) _ref25.getObject());
        }

        java.util.Collection<kor.model.Professor> _asResult_p = _ident_Professor1;
        java.util.Collection<kor.model.Professor> _whereResult = new java.util.ArrayList<kor.model.Professor>();
        int _whereLoopIndex = 0;

        for (kor.model.Professor _whereEl : _asResult_p) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            kor.model.Professor _ident_p = _whereEl;

            if (_ident_p != null) {
                ocb.activate(_ident_p, 1);
            }

            kor.model.Professor _dotEl1 = _ident_p;

            if (_ident_p != null) {
                ocb.activate(_ident_p, 2);
            }

            java.lang.Integer _mth_getAgeResult1 = _dotEl1.getAge();

            if (_mth_getAgeResult1 != null) {
                ocb.activate(_mth_getAgeResult1, 1);
            }

            java.lang.Double _ident__aux0 = _dotEl2;

            if (_ident__aux0 != null) {
                ocb.activate(_ident__aux0, 1);
            }

            Boolean _moreResult = (_mth_getAgeResult1 == null)
                ? ((_mth_getAgeResult1 == null) ? false : false)
                : ((_mth_getAgeResult1 == null) ? true
                                                : (_mth_getAgeResult1 > _ident__aux0));

            if (_moreResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<kor.model.Professor> _dotResult3 = new java.util.ArrayList<kor.model.Professor>();
        int _dotIndex3 = 0;

        for (kor.model.Professor _dotEl3 : _whereResult) {
            if (_dotEl3 == null) {
                continue;
            }

            if (_dotEl3 != null) {
                ocb.activate(_dotEl3, 1);
            }

            kor.model.Professor _ident_p1 = _dotEl3;

            if (_ident_p1 != null) {
                ocb.activate(_ident_p1, 1);
            }

            if (_ident_p1 != null) {
                ocb.activate(_ident_p1, 1);
            }

            _dotResult3.add(_ident_p1);
            _dotIndex3++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult3, ocb);

        return _dotResult3;
    }
}
