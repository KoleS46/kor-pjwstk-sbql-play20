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


public class KorData_SbqlQuery6Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery6Db4o0() {
    }

    /**
     * query='db.(Professor.(getFname(), getSname()) group as _aux0).(Student.(getFname(), getSname()) join _aux0)'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta6 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Professor");
        long[] _ids6 = _classMeta6.getIDs(transLocal);

        for (long _id6 : _ids6) {
            LazyObjectReference _ref6 = transLocal.lazyReferenceFor((int) _id6);
            _ident_Professor.add((kor.model.Professor) _ref6.getObject());
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex = 0;

        for (kor.model.Professor _dotEl : _ident_Professor) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            java.lang.String _mth_getSnameResult = _dotEl.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");

            if (_commaResult != null) {
                ocb.activate(_commaResult, 2);
            }

            _dotResult.add(_commaResult);
            _dotIndex++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _groupAsResult_aux0 =
            _dotResult;
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotEl2 =
            _groupAsResult_aux0;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta7 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Student");
        long[] _ids7 = _classMeta7.getIDs(transLocal);

        for (long _id7 : _ids7) {
            LazyObjectReference _ref7 = transLocal.lazyReferenceFor((int) _id7);
            _ident_Student.add((kor.model.Student) _ref7.getObject());
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult1 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex1 = 0;

        for (kor.model.Student _dotEl1 : _ident_Student) {
            if (_dotEl1 == null) {
                continue;
            }

            if (_dotEl1 != null) {
                ocb.activate(_dotEl1, 2);
            }

            java.lang.String _mth_getFnameResult1 = _dotEl1.getFname();

            if (_mth_getFnameResult1 != null) {
                ocb.activate(_mth_getFnameResult1, 1);
            }

            java.lang.String _mth_getSnameResult1 = _dotEl1.getSname();

            if (_mth_getSnameResult1 != null) {
                ocb.activate(_mth_getSnameResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_mth_getFnameResult1,
                    _mth_getSnameResult1, "", "");

            if (_commaResult1 != null) {
                ocb.activate(_commaResult1, 2);
            }

            _dotResult1.add(_commaResult1);
            _dotIndex1++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _joinResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _joinIndex = 0;

        for (pl.wcislo.sbql4j.java.model.runtime.Struct _joinEl : _dotResult1) {
            if (_joinEl != null) {
                ocb.activate(_joinEl, 1);
            }

            java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _ident__aux0 =
                _dotEl2;

            if (_ident__aux0 != null) {
                ocb.activate(_ident__aux0, 3);
            }

            _joinResult.addAll(OperatorUtils.cartesianProductSC(_joinEl,
                    _ident__aux0, "", ""));
            _joinIndex++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_joinResult, ocb);

        return _joinResult;
    }
}
