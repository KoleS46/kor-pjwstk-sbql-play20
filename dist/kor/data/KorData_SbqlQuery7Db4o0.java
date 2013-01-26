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


public class KorData_SbqlQuery7Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery7Db4o0() {
    }

    /**
     * query='db.(Student as s where s.getAverage() > 4.5 and s.getAverage() < 5).(s.getFname(), s.getSname(), s.getAverage())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta8 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Student");
        long[] _ids8 = _classMeta8.getIDs(transLocal);

        for (long _id8 : _ids8) {
            LazyObjectReference _ref8 = transLocal.lazyReferenceFor((int) _id8);
            _ident_Student.add((kor.model.Student) _ref8.getObject());
        }

        java.util.Collection<kor.model.Student> _asResult_s = _ident_Student;
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

            java.lang.Double _mth_getAverageResult = _dotEl.getAverage();

            if (_mth_getAverageResult != null) {
                ocb.activate(_mth_getAverageResult, 1);
            }

            Boolean _moreResult = (_mth_getAverageResult == null) ? false
                                                                  : (_mth_getAverageResult > 4.5);
            java.lang.Boolean _andResult;

            if (!_moreResult) {
                _andResult = false;
            } else {
                kor.model.Student _ident_s1 = _whereEl;

                if (_ident_s1 != null) {
                    ocb.activate(_ident_s1, 1);
                }

                kor.model.Student _dotEl1 = _ident_s1;

                if (_ident_s1 != null) {
                    ocb.activate(_ident_s1, 2);
                }

                java.lang.Double _mth_getAverageResult1 = _dotEl1.getAverage();

                if (_mth_getAverageResult1 != null) {
                    ocb.activate(_mth_getAverageResult1, 1);
                }

                Boolean _lessResult = _mth_getAverageResult1 < 5;
                _andResult = _lessResult;
            }

            if (_andResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult5 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex5 = 0;

        for (kor.model.Student _dotEl5 : _whereResult) {
            if (_dotEl5 == null) {
                continue;
            }

            if (_dotEl5 != null) {
                ocb.activate(_dotEl5, 2);
            }

            kor.model.Student _ident_s2 = _dotEl5;

            if (_ident_s2 != null) {
                ocb.activate(_ident_s2, 1);
            }

            kor.model.Student _dotEl2 = _ident_s2;

            if (_ident_s2 != null) {
                ocb.activate(_ident_s2, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl2.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            kor.model.Student _ident_s3 = _dotEl5;

            if (_ident_s3 != null) {
                ocb.activate(_ident_s3, 1);
            }

            kor.model.Student _dotEl3 = _ident_s3;

            if (_ident_s3 != null) {
                ocb.activate(_ident_s3, 2);
            }

            java.lang.String _mth_getSnameResult = _dotEl3.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");
            kor.model.Student _ident_s4 = _dotEl5;

            if (_ident_s4 != null) {
                ocb.activate(_ident_s4, 1);
            }

            kor.model.Student _dotEl4 = _ident_s4;

            if (_ident_s4 != null) {
                ocb.activate(_ident_s4, 2);
            }

            java.lang.Double _mth_getAverageResult2 = _dotEl4.getAverage();

            if (_mth_getAverageResult2 != null) {
                ocb.activate(_mth_getAverageResult2, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _mth_getAverageResult2, "", "");

            if (_commaResult1 != null) {
                ocb.activate(_commaResult1, 2);
            }

            _dotResult5.add(_commaResult1);
            _dotIndex5++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult5, ocb);

        return _dotResult5;
    }
}
