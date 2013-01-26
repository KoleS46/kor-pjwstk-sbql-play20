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


public class KorData_SbqlQuery14Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery14Db4o0() {
    }

    /**
     * query='db.( min(Student.getAge()) group as _aux0).(Student as s where s.getAge() == _aux0).s'
    '
     **/
    public java.util.Collection<kor.model.Student> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta16 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids16 = _classMeta16.getIDs(transLocal);

        for (long _id16 : _ids16) {
            LazyObjectReference _ref16 = transLocal.lazyReferenceFor((int) _id16);
            _ident_Student.add((kor.model.Student) _ref16.getObject());
        }

        java.util.Collection<java.lang.Integer> _dotResult = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex = 0;

        for (kor.model.Student _dotEl : _ident_Student) {
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

        Number _min0 = null;

        for (Number _minEl0 : _dotResult) {
            _min0 = MathUtils.min(_min0, _minEl0);
        }

        java.lang.Integer _minResult = (java.lang.Integer) _min0;
        java.lang.Integer _groupAsResult_aux0 = _minResult;
        java.lang.Integer _dotEl2 = _groupAsResult_aux0;
        final java.util.Collection<kor.model.Student> _ident_Student1 = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta17 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids17 = _classMeta17.getIDs(transLocal);

        for (long _id17 : _ids17) {
            LazyObjectReference _ref17 = transLocal.lazyReferenceFor((int) _id17);
            _ident_Student1.add((kor.model.Student) _ref17.getObject());
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

            kor.model.Student _dotEl1 = _ident_s;

            if (_ident_s != null) {
                ocb.activate(_ident_s, 2);
            }

            java.lang.Integer _mth_getAgeResult1 = _dotEl1.getAge();

            if (_mth_getAgeResult1 != null) {
                ocb.activate(_mth_getAgeResult1, 1);
            }

            java.lang.Integer _ident__aux0 = _dotEl2;

            if (_ident__aux0 != null) {
                ocb.activate(_ident__aux0, 1);
            }

            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getAgeResult1,
                    _ident__aux0);

            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<kor.model.Student> _dotResult3 = new java.util.ArrayList<kor.model.Student>();
        int _dotIndex3 = 0;

        for (kor.model.Student _dotEl3 : _whereResult) {
            if (_dotEl3 == null) {
                continue;
            }

            if (_dotEl3 != null) {
                ocb.activate(_dotEl3, 1);
            }

            kor.model.Student _ident_s1 = _dotEl3;

            if (_ident_s1 != null) {
                ocb.activate(_ident_s1, 1);
            }

            if (_ident_s1 != null) {
                ocb.activate(_ident_s1, 1);
            }

            _dotResult3.add(_ident_s1);
            _dotIndex3++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult3, ocb);

        return _dotResult3;
    }
}
