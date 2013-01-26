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


public class KorData_SbqlQuery15Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery15Db4o0() {
    }

    /**
     * query='db.(( min(Student.getAge()) group as _aux0).(Student where getAge() == _aux0) union ( max(Student.getAge()) group as _aux1).(Student where getAge() == _aux1))'
    '
     **/
    public java.util.Collection<kor.model.Student> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta18 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids18 = _classMeta18.getIDs(transLocal);

        for (long _id18 : _ids18) {
            LazyObjectReference _ref18 = transLocal.lazyReferenceFor((int) _id18);
            _ident_Student.add((kor.model.Student) _ref18.getObject());
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

        Number _min1 = null;

        for (Number _minEl1 : _dotResult) {
            _min1 = MathUtils.min(_min1, _minEl1);
        }

        java.lang.Integer _minResult = (java.lang.Integer) _min1;
        java.lang.Integer _groupAsResult_aux0 = _minResult;
        java.lang.Integer _dotEl1 = _groupAsResult_aux0;
        final java.util.Collection<kor.model.Student> _ident_Student1 = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta19 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids19 = _classMeta19.getIDs(transLocal);

        for (long _id19 : _ids19) {
            LazyObjectReference _ref19 = transLocal.lazyReferenceFor((int) _id19);
            _ident_Student1.add((kor.model.Student) _ref19.getObject());
        }

        java.util.Collection<kor.model.Student> _whereResult = new java.util.ArrayList<kor.model.Student>();
        int _whereLoopIndex = 0;

        for (kor.model.Student _whereEl : _ident_Student1) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            java.lang.Integer _mth_getAgeResult1 = _whereEl.getAge();

            if (_mth_getAgeResult1 != null) {
                ocb.activate(_mth_getAgeResult1, 1);
            }

            java.lang.Integer _ident__aux0 = _dotEl1;

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

        final java.util.Collection<kor.model.Student> _ident_Student2 = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta20 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids20 = _classMeta20.getIDs(transLocal);

        for (long _id20 : _ids20) {
            LazyObjectReference _ref20 = transLocal.lazyReferenceFor((int) _id20);
            _ident_Student2.add((kor.model.Student) _ref20.getObject());
        }

        java.util.Collection<java.lang.Integer> _dotResult2 = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex2 = 0;

        for (kor.model.Student _dotEl2 : _ident_Student2) {
            if (_dotEl2 == null) {
                continue;
            }

            if (_dotEl2 != null) {
                ocb.activate(_dotEl2, 1);
            }

            java.lang.Integer _mth_getAgeResult2 = _dotEl2.getAge();

            if (_mth_getAgeResult2 != null) {
                ocb.activate(_mth_getAgeResult2, 1);
            }

            if (_mth_getAgeResult2 != null) {
                ocb.activate(_mth_getAgeResult2, 1);
            }

            _dotResult2.add(_mth_getAgeResult2);
            _dotIndex2++;
        }

        Number _max1 = null;

        for (Number _maxEl1 : _dotResult2) {
            _max1 = MathUtils.max(_max1, _maxEl1);
        }

        java.lang.Integer _maxResult = (java.lang.Integer) _max1;
        java.lang.Integer _groupAsResult_aux1 = _maxResult;
        java.lang.Integer _dotEl3 = _groupAsResult_aux1;
        final java.util.Collection<kor.model.Student> _ident_Student3 = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta21 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids21 = _classMeta21.getIDs(transLocal);

        for (long _id21 : _ids21) {
            LazyObjectReference _ref21 = transLocal.lazyReferenceFor((int) _id21);
            _ident_Student3.add((kor.model.Student) _ref21.getObject());
        }

        java.util.Collection<kor.model.Student> _whereResult1 = new java.util.ArrayList<kor.model.Student>();
        int _whereLoopIndex1 = 0;

        for (kor.model.Student _whereEl1 : _ident_Student3) {
            if (_whereEl1 == null) {
                continue;
            }

            if (_whereEl1 != null) {
                ocb.activate(_whereEl1, 1);
            }

            java.lang.Integer _mth_getAgeResult3 = _whereEl1.getAge();

            if (_mth_getAgeResult3 != null) {
                ocb.activate(_mth_getAgeResult3, 1);
            }

            java.lang.Integer _ident__aux1 = _dotEl3;

            if (_ident__aux1 != null) {
                ocb.activate(_ident__aux1, 1);
            }

            java.lang.Boolean _equalsResult1 = OperatorUtils.equalsSafe(_mth_getAgeResult3,
                    _ident__aux1);

            if (_equalsResult1) {
                _whereResult1.add(_whereEl1);
            }

            _whereLoopIndex1++;
        }

        java.util.Collection<kor.model.Student> _unionResult = new java.util.ArrayList<kor.model.Student>();
        _unionResult.addAll(_whereResult);
        _unionResult.addAll(_whereResult1);
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_unionResult, ocb);

        return _unionResult;
    }
}
