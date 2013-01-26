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


public class KorData_SbqlQuery2Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery2Db4o0() {
    }

    /**
     * query='db.Professor.(getFname(), getSname(), getTitle(), getAddress().getStreet(), getAddress().getCity(), getAddress().getZip())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Professor> _ident_Professor = new java.util.ArrayList<kor.model.Professor>();
        ClassMetadata _classMeta2 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Professor");
        long[] _ids2 = _classMeta2.getIDs(transLocal);

        for (long _id2 : _ids2) {
            LazyObjectReference _ref2 = transLocal.lazyReferenceFor((int) _id2);
            _ident_Professor.add((kor.model.Professor) _ref2.getObject());
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult3 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex3 = 0;

        for (kor.model.Professor _dotEl3 : _ident_Professor) {
            if (_dotEl3 == null) {
                continue;
            }

            if (_dotEl3 != null) {
                ocb.activate(_dotEl3, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl3.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            java.lang.String _mth_getSnameResult = _dotEl3.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");
            java.lang.String _mth_getTitleResult = _dotEl3.getTitle();

            if (_mth_getTitleResult != null) {
                ocb.activate(_mth_getTitleResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _mth_getTitleResult, "", "");
            kor.model.Address _mth_getAddressResult = _dotEl3.getAddress();

            if (_mth_getAddressResult != null) {
                ocb.activate(_mth_getAddressResult, 1);
            }

            kor.model.Address _dotEl = _mth_getAddressResult;

            if (_mth_getAddressResult != null) {
                ocb.activate(_mth_getAddressResult, 2);
            }

            java.lang.String _mth_getStreetResult = _dotEl.getStreet();

            if (_mth_getStreetResult != null) {
                ocb.activate(_mth_getStreetResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _mth_getStreetResult, "", "");
            kor.model.Address _mth_getAddressResult1 = _dotEl3.getAddress();

            if (_mth_getAddressResult1 != null) {
                ocb.activate(_mth_getAddressResult1, 1);
            }

            kor.model.Address _dotEl1 = _mth_getAddressResult1;

            if (_mth_getAddressResult1 != null) {
                ocb.activate(_mth_getAddressResult1, 2);
            }

            java.lang.String _mth_getCityResult = _dotEl1.getCity();

            if (_mth_getCityResult != null) {
                ocb.activate(_mth_getCityResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult3 = OperatorUtils.cartesianProductSS(_commaResult2,
                    _mth_getCityResult, "", "");
            kor.model.Address _mth_getAddressResult2 = _dotEl3.getAddress();

            if (_mth_getAddressResult2 != null) {
                ocb.activate(_mth_getAddressResult2, 1);
            }

            kor.model.Address _dotEl2 = _mth_getAddressResult2;

            if (_mth_getAddressResult2 != null) {
                ocb.activate(_mth_getAddressResult2, 2);
            }

            java.lang.String _mth_getZipResult = _dotEl2.getZip();

            if (_mth_getZipResult != null) {
                ocb.activate(_mth_getZipResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult4 = OperatorUtils.cartesianProductSS(_commaResult3,
                    _mth_getZipResult, "", "");

            if (_commaResult4 != null) {
                ocb.activate(_commaResult4, 2);
            }

            _dotResult3.add(_commaResult4);
            _dotIndex3++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult3, ocb);

        return _dotResult3;
    }
}
