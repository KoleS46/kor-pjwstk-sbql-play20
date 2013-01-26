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


public class KorData_SbqlQuery8Db4o0 implements Db4oSBQLQuery {
    private java.lang.String tite;

    public KorData_SbqlQuery8Db4o0(java.lang.String tite) {
        this.tite = tite;
    }

    /**
     * query='db.(Professor as p where p.getTitle() == tite).(p.getFname(), p.getSname(), p.getTitle())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta9 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Professor");
        long[] _ids9 = _classMeta9.getIDs(transLocal);

        for (long _id9 : _ids9) {
            LazyObjectReference _ref9 = transLocal.lazyReferenceFor((int) _id9);
            _ident_Professor.add((kor.model.Professor) _ref9.getObject());
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

            java.lang.String _mth_getTitleResult = _dotEl.getTitle();

            if (_mth_getTitleResult != null) {
                ocb.activate(_mth_getTitleResult, 1);
            }

            java.lang.String _ident_tite = tite;
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getTitleResult,
                    _ident_tite);

            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult4 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex4 = 0;

        for (kor.model.Professor _dotEl4 : _whereResult) {
            if (_dotEl4 == null) {
                continue;
            }

            if (_dotEl4 != null) {
                ocb.activate(_dotEl4, 2);
            }

            kor.model.Professor _ident_p1 = _dotEl4;

            if (_ident_p1 != null) {
                ocb.activate(_ident_p1, 1);
            }

            kor.model.Professor _dotEl1 = _ident_p1;

            if (_ident_p1 != null) {
                ocb.activate(_ident_p1, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl1.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            kor.model.Professor _ident_p2 = _dotEl4;

            if (_ident_p2 != null) {
                ocb.activate(_ident_p2, 1);
            }

            kor.model.Professor _dotEl2 = _ident_p2;

            if (_ident_p2 != null) {
                ocb.activate(_ident_p2, 2);
            }

            java.lang.String _mth_getSnameResult = _dotEl2.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");
            kor.model.Professor _ident_p3 = _dotEl4;

            if (_ident_p3 != null) {
                ocb.activate(_ident_p3, 1);
            }

            kor.model.Professor _dotEl3 = _ident_p3;

            if (_ident_p3 != null) {
                ocb.activate(_ident_p3, 2);
            }

            java.lang.String _mth_getTitleResult1 = _dotEl3.getTitle();

            if (_mth_getTitleResult1 != null) {
                ocb.activate(_mth_getTitleResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _mth_getTitleResult1, "", "");

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
