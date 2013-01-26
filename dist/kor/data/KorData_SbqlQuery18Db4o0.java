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


public class KorData_SbqlQuery18Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery18Db4o0() {
    }

    /**
     * query='db.( sum Professor.getAge(),  sum Student.getAge(),  avg(Professor.getPensum()),  avg(Student.getAverage()))'
    '
     **/
    public pl.wcislo.sbql4j.java.model.runtime.Struct executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta26 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids26 = _classMeta26.getIDs(transLocal);

        for (long _id26 : _ids26) {
            LazyObjectReference _ref26 = transLocal.lazyReferenceFor((int) _id26);
            _ident_Professor.add((kor.model.Professor) _ref26.getObject());
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

        Number _sum0 = null;

        for (Number _sumEl0 : _dotResult) {
            _sum0 = MathUtils.sum(_sum0, _sumEl0);
        }

        java.lang.Integer _sumResult = (java.lang.Integer) _sum0;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta27 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids27 = _classMeta27.getIDs(transLocal);

        for (long _id27 : _ids27) {
            LazyObjectReference _ref27 = transLocal.lazyReferenceFor((int) _id27);
            _ident_Student.add((kor.model.Student) _ref27.getObject());
        }

        java.util.Collection<java.lang.Integer> _dotResult1 = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex1 = 0;

        for (kor.model.Student _dotEl1 : _ident_Student) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 1);
            }

            java.lang.Integer _mth_getAgeResult1 = _dotEl1.getAge();

            if (_mth_getAgeResult1 != null) {
                ocb.activate(_mth_getAgeResult1, 1);
            }

            if (_mth_getAgeResult1 != null) {
                ocb.activate(_mth_getAgeResult1, 1);
            }

            _dotResult1.add(_mth_getAgeResult1);
            _dotIndex1++;
        }

        Number _sum1 = null;

        for (Number _sumEl1 : _dotResult1) {
            _sum1 = MathUtils.sum(_sum1, _sumEl1);
        }

        java.lang.Integer _sumResult1 = (java.lang.Integer) _sum1;
        pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_sumResult,
                _sumResult1, "", "");
        final java.util.Collection<kor.model.Professor> _ident_Professor1 = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta28 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids28 = _classMeta28.getIDs(transLocal);

        for (long _id28 : _ids28) {
            LazyObjectReference _ref28 = transLocal.lazyReferenceFor((int) _id28);
            _ident_Professor1.add((kor.model.Professor) _ref28.getObject());
        }

        java.util.Collection<java.lang.Integer> _dotResult2 = new java.util.ArrayList<java.lang.Integer>();
        int _dotIndex2 = 0;

        for (kor.model.Professor _dotEl2 : _ident_Professor1) {
            if (_dotEl2 == null) {
                continue;
            }

            if (_dotEl2 != null) {
                ocb.activate(_dotEl2, 1);
            }

            java.lang.Integer _mth_getPensumResult = _dotEl2.getPensum();

            if (_mth_getPensumResult != null) {
                ocb.activate(_mth_getPensumResult, 1);
            }

            if (_mth_getPensumResult != null) {
                ocb.activate(_mth_getPensumResult, 1);
            }

            _dotResult2.add(_mth_getPensumResult);
            _dotIndex2++;
        }

        java.lang.Double _avgResult = 0d;

        if ((_dotResult2 != null) && !_dotResult2.isEmpty()) {
            Number _avgSum1 = null;

            for (Number _avgEl1 : _dotResult2) {
                _avgSum1 = MathUtils.sum(_avgSum1, _avgEl1);
            }

            _avgResult = _avgSum1.doubleValue() / _dotResult2.size();
        }

        pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                _avgResult, "", "");
        final java.util.Collection<kor.model.Student> _ident_Student1 = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta29 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids29 = _classMeta29.getIDs(transLocal);

        for (long _id29 : _ids29) {
            LazyObjectReference _ref29 = transLocal.lazyReferenceFor((int) _id29);
            _ident_Student1.add((kor.model.Student) _ref29.getObject());
        }

        java.util.Collection<java.lang.Double> _dotResult3 = new java.util.ArrayList<java.lang.Double>();
        int _dotIndex3 = 0;

        for (kor.model.Student _dotEl3 : _ident_Student1) {
            if (_dotEl3 == null) {
                continue;
            }

            if (_dotEl3 != null) {
                ocb.activate(_dotEl3, 1);
            }

            java.lang.Double _mth_getAverageResult = _dotEl3.getAverage();

            if (_mth_getAverageResult != null) {
                ocb.activate(_mth_getAverageResult, 1);
            }

            if (_mth_getAverageResult != null) {
                ocb.activate(_mth_getAverageResult, 1);
            }

            _dotResult3.add(_mth_getAverageResult);
            _dotIndex3++;
        }

        java.lang.Double _avgResult1 = 0d;

        if ((_dotResult3 != null) && !_dotResult3.isEmpty()) {
            Number _avgSum2 = null;

            for (Number _avgEl2 : _dotResult3) {
                _avgSum2 = MathUtils.sum(_avgSum2, _avgEl2);
            }

            _avgResult1 = _avgSum2.doubleValue() / _dotResult3.size();
        }

        pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                _avgResult1, "", "");
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_commaResult2, ocb);

        return _commaResult2;
    }
}
