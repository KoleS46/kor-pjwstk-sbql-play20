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


public class KorData_SbqlQuery16Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery16Db4o0() {
    }

    /**
     * query='db.(Class.getShortname() group as _aux0).(Student as s where s.getClasses().getShortname() in _aux0)'
    '
     **/
    public java.util.Collection<kor.model.Student> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Class> _ident_Class = new java.util.ArrayList<kor.model.Class>();
        ClassMetadata _classMeta22 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Class");
        long[] _ids22 = _classMeta22.getIDs(transLocal);

        for (long _id22 : _ids22) {
            LazyObjectReference _ref22 = transLocal.lazyReferenceFor((int) _id22);
            _ident_Class.add((kor.model.Class) _ref22.getObject());
        }

        java.util.Collection<java.lang.String> _dotResult = new java.util.ArrayList<java.lang.String>();
        int _dotIndex = 0;

        for (kor.model.Class _dotEl : _ident_Class) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            java.lang.String _mth_getShortnameResult = _dotEl.getShortname();

            if (_mth_getShortnameResult != null) {
                ocb.activate(_mth_getShortnameResult, 1);
            }

            if (_mth_getShortnameResult != null) {
                ocb.activate(_mth_getShortnameResult, 1);
            }

            _dotResult.add(_mth_getShortnameResult);
            _dotIndex++;
        }

        java.util.Collection<java.lang.String> _groupAsResult_aux0 = _dotResult;
        java.util.Collection<java.lang.String> _dotEl3 = _groupAsResult_aux0;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta23 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Student");
        long[] _ids23 = _classMeta23.getIDs(transLocal);

        for (long _id23 : _ids23) {
            LazyObjectReference _ref23 = transLocal.lazyReferenceFor((int) _id23);
            _ident_Student.add((kor.model.Student) _ref23.getObject());
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

            kor.model.Student _dotEl1 = _ident_s;

            if (_ident_s != null) {
                ocb.activate(_ident_s, 2);
            }

            java.util.List<kor.model.Class> _mth_getClassesResult = _dotEl1.getClasses();

            if (_mth_getClassesResult != null) {
                ocb.activate(_mth_getClassesResult, 2);
            }

            java.util.List<java.lang.String> _dotResult2 = new java.util.ArrayList<java.lang.String>();
            int _dotIndex2 = 0;

            for (kor.model.Class _dotEl2 : _mth_getClassesResult) {
                if (_dotEl2 == null) {
                    continue;
                }

                if (_dotEl2 != null) {
                    ocb.activate(_dotEl2, 1);
                }

                java.lang.String _mth_getShortnameResult1 = _dotEl2.getShortname();

                if (_mth_getShortnameResult1 != null) {
                    ocb.activate(_mth_getShortnameResult1, 1);
                }

                if (_mth_getShortnameResult1 != null) {
                    ocb.activate(_mth_getShortnameResult1, 1);
                }

                _dotResult2.add(_mth_getShortnameResult1);
                _dotIndex2++;
            }

            java.util.Collection<java.lang.String> _ident__aux0 = _dotEl3;

            if (_ident__aux0 != null) {
                ocb.activate(_ident__aux0, 2);
            }

            java.lang.Boolean _inResult = _ident__aux0.containsAll(_dotResult2);

            if (_inResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_whereResult, ocb);

        return _whereResult;
    }
}
