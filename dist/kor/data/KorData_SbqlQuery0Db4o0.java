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


public class KorData_SbqlQuery0Db4o0 implements Db4oSBQLQuery {
    private java.lang.String name;

    public KorData_SbqlQuery0Db4o0(java.lang.String name) {
        this.name = name;
    }

    /**
     * query='db.(Class as c where c.getShortname() == name).(c.getName(), c.getShortname())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Class> _ident_Class = new java.util.ArrayList<kor.model.Class>();
        ClassMetadata _classMeta0 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Class");
        long[] _ids0 = _classMeta0.getIDs(transLocal);

        for (long _id0 : _ids0) {
            LazyObjectReference _ref0 = transLocal.lazyReferenceFor((int) _id0);
            _ident_Class.add((kor.model.Class) _ref0.getObject());
        }

        java.util.Collection<kor.model.Class> _asResult_c = _ident_Class;
        java.util.Collection<kor.model.Class> _whereResult = new java.util.ArrayList<kor.model.Class>();
        int _whereLoopIndex = 0;

        for (kor.model.Class _whereEl : _asResult_c) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            kor.model.Class _ident_c = _whereEl;

            if (_ident_c != null) {
                ocb.activate(_ident_c, 1);
            }

            kor.model.Class _dotEl = _ident_c;

            if (_ident_c != null) {
                ocb.activate(_ident_c, 2);
            }

            java.lang.String _mth_getShortnameResult = _dotEl.getShortname();

            if (_mth_getShortnameResult != null) {
                ocb.activate(_mth_getShortnameResult, 1);
            }

            java.lang.String _ident_name = name;
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getShortnameResult,
                    _ident_name);

            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult3 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex3 = 0;

        for (kor.model.Class _dotEl3 : _whereResult) {
            if (_dotEl3 == null) {
                continue;
            }

            if (_dotEl3 != null) {
                ocb.activate(_dotEl3, 2);
            }

            kor.model.Class _ident_c1 = _dotEl3;

            if (_ident_c1 != null) {
                ocb.activate(_ident_c1, 1);
            }

            kor.model.Class _dotEl1 = _ident_c1;

            if (_ident_c1 != null) {
                ocb.activate(_ident_c1, 2);
            }

            java.lang.String _mth_getNameResult = _dotEl1.getName();

            if (_mth_getNameResult != null) {
                ocb.activate(_mth_getNameResult, 1);
            }

            kor.model.Class _ident_c2 = _dotEl3;

            if (_ident_c2 != null) {
                ocb.activate(_ident_c2, 1);
            }

            kor.model.Class _dotEl2 = _ident_c2;

            if (_ident_c2 != null) {
                ocb.activate(_ident_c2, 2);
            }

            java.lang.String _mth_getShortnameResult1 = _dotEl2.getShortname();

            if (_mth_getShortnameResult1 != null) {
                ocb.activate(_mth_getShortnameResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getNameResult,
                    _mth_getShortnameResult1, "", "");

            if (_commaResult != null) {
                ocb.activate(_commaResult, 2);
            }

            _dotResult3.add(_commaResult);
            _dotIndex3++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult3, ocb);

        return _dotResult3;
    }
}
