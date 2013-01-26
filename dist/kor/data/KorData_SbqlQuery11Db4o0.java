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


public class KorData_SbqlQuery11Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery11Db4o0() {
    }

    /**
     * query='db.(Professor as p where p.getPensum() + p.getAge() >= 100).(p.getFname(), p.getSname(), p.getPensum(), p.getAge(), p.getPensum() + p.getAge())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta12 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids12 = _classMeta12.getIDs(transLocal);

        for (long _id12 : _ids12) {
            LazyObjectReference _ref12 = transLocal.lazyReferenceFor((int) _id12);
            _ident_Professor.add((kor.model.Professor) _ref12.getObject());
        }

        java.util.Collection<kor.model.Professor> _asResult_p = _ident_Professor;
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

            kor.model.Professor _dotEl = _ident_p;

            if (_ident_p != null) {
                ocb.activate(_ident_p, 2);
            }

            java.lang.Integer _mth_getPensumResult = _dotEl.getPensum();

            if (_mth_getPensumResult != null) {
                ocb.activate(_mth_getPensumResult, 1);
            }

            kor.model.Professor _ident_p1 = _whereEl;

            if (_ident_p1 != null) {
                ocb.activate(_ident_p1, 1);
            }

            kor.model.Professor _dotEl1 = _ident_p1;

            if (_ident_p1 != null) {
                ocb.activate(_ident_p1, 2);
            }

            java.lang.Integer _mth_getAgeResult = _dotEl1.getAge();

            if (_mth_getAgeResult != null) {
                ocb.activate(_mth_getAgeResult, 1);
            }

            java.lang.Integer _plusResult = _mth_getPensumResult +
                _mth_getAgeResult;

            Boolean _more_or_equalResult = _plusResult >= 100;

            if (_more_or_equalResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult8 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex8 = 0;

        for (kor.model.Professor _dotEl8 : _whereResult) {
            if (_dotEl8 == null) {
                continue;
            }

            if (_dotEl8 != null) {
                ocb.activate(_dotEl8, 2);
            }

            kor.model.Professor _ident_p2 = _dotEl8;

            if (_ident_p2 != null) {
                ocb.activate(_ident_p2, 1);
            }

            kor.model.Professor _dotEl2 = _ident_p2;

            if (_ident_p2 != null) {
                ocb.activate(_ident_p2, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl2.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            kor.model.Professor _ident_p3 = _dotEl8;

            if (_ident_p3 != null) {
                ocb.activate(_ident_p3, 1);
            }

            kor.model.Professor _dotEl3 = _ident_p3;

            if (_ident_p3 != null) {
                ocb.activate(_ident_p3, 2);
            }

            java.lang.String _mth_getSnameResult = _dotEl3.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");
            kor.model.Professor _ident_p4 = _dotEl8;

            if (_ident_p4 != null) {
                ocb.activate(_ident_p4, 1);
            }

            kor.model.Professor _dotEl4 = _ident_p4;

            if (_ident_p4 != null) {
                ocb.activate(_ident_p4, 2);
            }

            java.lang.Integer _mth_getPensumResult1 = _dotEl4.getPensum();

            if (_mth_getPensumResult1 != null) {
                ocb.activate(_mth_getPensumResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _mth_getPensumResult1, "", "");
            kor.model.Professor _ident_p5 = _dotEl8;

            if (_ident_p5 != null) {
                ocb.activate(_ident_p5, 1);
            }

            kor.model.Professor _dotEl5 = _ident_p5;

            if (_ident_p5 != null) {
                ocb.activate(_ident_p5, 2);
            }

            java.lang.Integer _mth_getAgeResult1 = _dotEl5.getAge();

            if (_mth_getAgeResult1 != null) {
                ocb.activate(_mth_getAgeResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _mth_getAgeResult1, "", "");
            kor.model.Professor _ident_p6 = _dotEl8;

            if (_ident_p6 != null) {
                ocb.activate(_ident_p6, 1);
            }

            kor.model.Professor _dotEl6 = _ident_p6;

            if (_ident_p6 != null) {
                ocb.activate(_ident_p6, 2);
            }

            java.lang.Integer _mth_getPensumResult2 = _dotEl6.getPensum();

            if (_mth_getPensumResult2 != null) {
                ocb.activate(_mth_getPensumResult2, 1);
            }

            kor.model.Professor _ident_p7 = _dotEl8;

            if (_ident_p7 != null) {
                ocb.activate(_ident_p7, 1);
            }

            kor.model.Professor _dotEl7 = _ident_p7;

            if (_ident_p7 != null) {
                ocb.activate(_ident_p7, 2);
            }

            java.lang.Integer _mth_getAgeResult2 = _dotEl7.getAge();

            if (_mth_getAgeResult2 != null) {
                ocb.activate(_mth_getAgeResult2, 1);
            }

            java.lang.Integer _plusResult1 = _mth_getPensumResult2 +
                _mth_getAgeResult2;
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult3 = OperatorUtils.cartesianProductSS(_commaResult2,
                    _plusResult1, "", "");

            if (_commaResult3 != null) {
                ocb.activate(_commaResult3, 2);
            }

            _dotResult8.add(_commaResult3);
            _dotIndex8++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult8, ocb);

        return _dotResult8;
    }
}
