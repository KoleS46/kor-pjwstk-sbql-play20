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


public class KorData_SbqlQuery3Db4o0 implements Db4oSBQLQuery {
    public KorData_SbqlQuery3Db4o0() {
    }

    /**
     * query='db.Student.(getFname(), getSname(), getAddress().getStreet(), getAddress().getCity(), getAddress().getZip(), getPromoter().getFname(), getPromoter().getSname())'
    '
     **/
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        final LocalTransaction transLocal = (LocalTransaction) t;
        final java.util.Collection<kor.model.Student> _ident_Student = new java.util.ArrayList<kor.model.Student>();
        ClassMetadata _classMeta3 = ocb.classCollection()
                                       .getClassMetadata("kor.model.Student");
        long[] _ids3 = _classMeta3.getIDs(transLocal);

        for (long _id3 : _ids3) {
            LazyObjectReference _ref3 = transLocal.lazyReferenceFor((int) _id3);
            _ident_Student.add((kor.model.Student) _ref3.getObject());
        }

        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _dotResult5 =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex5 = 0;

        for (kor.model.Student _dotEl5 : _ident_Student) {
            if (_dotEl5 == null) {
                continue;
            }

            if (_dotEl5 != null) {
                ocb.activate(_dotEl5, 2);
            }

            java.lang.String _mth_getFnameResult = _dotEl5.getFname();

            if (_mth_getFnameResult != null) {
                ocb.activate(_mth_getFnameResult, 1);
            }

            java.lang.String _mth_getSnameResult = _dotEl5.getSname();

            if (_mth_getSnameResult != null) {
                ocb.activate(_mth_getSnameResult, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_mth_getFnameResult,
                    _mth_getSnameResult, "", "");
            kor.model.Address _mth_getAddressResult = _dotEl5.getAddress();

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

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _mth_getStreetResult, "", "");
            kor.model.Address _mth_getAddressResult1 = _dotEl5.getAddress();

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

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _mth_getCityResult, "", "");
            kor.model.Address _mth_getAddressResult2 = _dotEl5.getAddress();

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

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult3 = OperatorUtils.cartesianProductSS(_commaResult2,
                    _mth_getZipResult, "", "");
            kor.model.Professor _mth_getPromoterResult = _dotEl5.getPromoter();

            if (_mth_getPromoterResult != null) {
                ocb.activate(_mth_getPromoterResult, 1);
            }

            kor.model.Professor _dotEl3 = _mth_getPromoterResult;

            if (_mth_getPromoterResult != null) {
                ocb.activate(_mth_getPromoterResult, 2);
            }

            java.lang.String _mth_getFnameResult1 = _dotEl3.getFname();

            if (_mth_getFnameResult1 != null) {
                ocb.activate(_mth_getFnameResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult4 = OperatorUtils.cartesianProductSS(_commaResult3,
                    _mth_getFnameResult1, "", "");
            kor.model.Professor _mth_getPromoterResult1 = _dotEl5.getPromoter();

            if (_mth_getPromoterResult1 != null) {
                ocb.activate(_mth_getPromoterResult1, 1);
            }

            kor.model.Professor _dotEl4 = _mth_getPromoterResult1;

            if (_mth_getPromoterResult1 != null) {
                ocb.activate(_mth_getPromoterResult1, 2);
            }

            java.lang.String _mth_getSnameResult1 = _dotEl4.getSname();

            if (_mth_getSnameResult1 != null) {
                ocb.activate(_mth_getSnameResult1, 1);
            }

            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult5 = OperatorUtils.cartesianProductSS(_commaResult4,
                    _mth_getSnameResult1, "", "");

            if (_commaResult5 != null) {
                ocb.activate(_commaResult5, 2);
            }

            _dotResult5.add(_commaResult5);
            _dotIndex5++;
        }

        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult5, ocb);

        return _dotResult5;
    }
}
