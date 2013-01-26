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


public class KorData_SbqlQuery10Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery10Db4o0() {
    }

    /**
     * query='db.(Student as s where s.getYear() != 1).(s.getFname(), s.getSname(), s.getYear())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta11 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids11 = _classMeta11.getIDs(transLocal);

        for (long _id11 : _ids11) {
            LazyObjectReference _ref11 = transLocal.lazyReferenceFor((int) _id11);
            _ident_Student.add((kor.model.Student) _ref11.getObject());
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

            java.lang.Integer _mth_getYearResult = _dotEl.getYear();

            if (_mth_getYearResult != null) {
                ocb.activate(_mth_getYearResult, 1);
            }

            java.lang.Boolean _not_equalsResult = !OperatorUtils.equalsSafe(_mth_getYearResult,
                    1);

            if (_not_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult4 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex4 = 0;

        for (kor.model.Student _dotEl4 : _whereResult) {
            if (_dotEl4 == null) {
                continue;
            }

            if (_dotEl4 != null) {
                ocb.activate(_dotEl4, 2);
            }

            kor.model.Student _ident_s1 = _dotEl4;

            if (_ident_s1 != null) {
                ocb.activate(_ident_s1, 1);
            }

            kor.model.Student _dotEl1 = _ident_s1;

            if (_ident_s1 != null) {
                ocb.activate(_ident_s1, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl1.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            kor.model.Student _ident_s2 = _dotEl4;

            if (_ident_s2 != null) {
                ocb.activate(_ident_s2, 1);
            }

            kor.model.Student _dotEl2 = _ident_s2;

            if (_ident_s2 != null) {
                ocb.activate(_ident_s2, 2);
            }

            java.lang.String _mth_getSnameResult = _dotEl2.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");
            kor.model.Student _ident_s3 = _dotEl4;

            if (_ident_s3 != null) {
                ocb.activate(_ident_s3, 1);
            }

            kor.model.Student _dotEl3 = _ident_s3;

            if (_ident_s3 != null) {
                ocb.activate(_ident_s3, 2);
            }

            java.lang.Integer _mth_getYearResult1 = _dotEl3.getYear();

            if (_mth_getYearResult1 != null) {
                ocb.activate(_mth_getYearResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _mth_getYearResult1, "", "");

            if (_commaResult1 != null) {
                ocb.activate(_commaResult1, 2);
            }

            _dotResult4.add(_commaResult1);
            _dotIndex4++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult4, ocb);

        return _dotResult4;
    }
}
