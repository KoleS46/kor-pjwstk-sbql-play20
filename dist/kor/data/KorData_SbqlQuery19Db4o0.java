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


public class KorData_SbqlQuery19Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery19Db4o0() {
    }

    /**
     * query='db.(Professor as p order by (p.getAddress().getCity()))'
    '
     **/
    public java.util.List<kor.model.Professor> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta30 = ocb.classCollection()
                                        .getClassMetadata("kor.model.Professor");
        long[] _ids30 = _classMeta30.getIDs(transLocal);

        for (long _id30 : _ids30) {
            LazyObjectReference _ref30 = transLocal.lazyReferenceFor((int) _id30);
            _ident_Professor.add((kor.model.Professor) _ref30.getObject());
        }

        java.util.Collection<kor.model.Professor> _asResult_p = _ident_Professor;
        java.util.List<kor.model.Professor> _orderByResult = new java.util.ArrayList<kor.model.Professor>();

        if (_asResult_p != null) {
            ocb.activate(_asResult_p, 2);
        }

        _orderByResult.addAll(_asResult_p);

        Comparator<kor.model.Professor> _comparator0 = new Comparator<kor.model.Professor>() {
                public int compare(kor.model.Professor _leftObj,
                    kor.model.Professor _rightObj) {
                    if (_leftObj == null) {
                        return -1;
                    }

                    if (_leftObj != null) {
                        ocb.activate(_leftObj, 1);
                    }

                    if (_rightObj != null) {
                        ocb.activate(_rightObj, 1);
                    }

                    int res = 0;
                    java.lang.String _leftParam0;

                    {
                        kor.model.Professor _ident_p = _leftObj;

                        if (_ident_p != null) {
                            ocb.activate(_ident_p, 1);
                        }

                        kor.model.Professor _dotEl = _ident_p;

                        if (_ident_p != null) {
                            ocb.activate(_ident_p, 2);
                        }

                        kor.model.Address _mth_getAddressResult = _dotEl.getAddress();

                        if (_mth_getAddressResult != null) {
                            ocb.activate(_mth_getAddressResult, 1);
                        }

                        kor.model.Address _dotEl1 = _mth_getAddressResult;

                        if (_mth_getAddressResult != null) {
                            ocb.activate(_mth_getAddressResult, 2);
                        }

                        java.lang.String _mth_getCityResult = _dotEl1.getCity();

                        if (_mth_getCityResult != null) {
                            ocb.activate(_mth_getCityResult, 1);
                        }

                        _leftParam0 = _mth_getCityResult;
                    }

                    java.lang.String _rightParam0;

                    {
                        kor.model.Professor _ident_p = _rightObj;

                        if (_ident_p != null) {
                            ocb.activate(_ident_p, 1);
                        }

                        kor.model.Professor _dotEl = _ident_p;

                        if (_ident_p != null) {
                            ocb.activate(_ident_p, 2);
                        }

                        kor.model.Address _mth_getAddressResult = _dotEl.getAddress();

                        if (_mth_getAddressResult != null) {
                            ocb.activate(_mth_getAddressResult, 1);
                        }

                        kor.model.Address _dotEl1 = _mth_getAddressResult;

                        if (_mth_getAddressResult != null) {
                            ocb.activate(_mth_getAddressResult, 2);
                        }

                        java.lang.String _mth_getCityResult = _dotEl1.getCity();

                        if (_mth_getCityResult != null) {
                            ocb.activate(_mth_getCityResult, 1);
                        }

                        _rightParam0 = _mth_getCityResult;
                    }

                    if (_leftParam0 != null) {
                        res = _leftParam0.compareTo(_rightParam0);
                    } else {
                        return -1;
                    }

                    return res;
                }
            };

        Collections.sort(_orderByResult, _comparator0);
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_orderByResult,
            ocb);

        return _orderByResult;
    }
}
