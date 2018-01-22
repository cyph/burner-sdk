#include <hxcpp.h>

#ifndef INCLUDED_haxe_io_ArrayBufferViewImpl
#include <haxe/io/ArrayBufferViewImpl.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io_Error
#include <haxe/io/Error.h>
#endif
#ifndef INCLUDED_haxe_io__ArrayBufferView_ArrayBufferView_Impl_
#include <haxe/io/_ArrayBufferView/ArrayBufferView_Impl_.h>
#endif
namespace haxe{
namespace io{
namespace _ArrayBufferView{

Void ArrayBufferView_Impl__obj::__construct()
{
	return null();
}

//ArrayBufferView_Impl__obj::~ArrayBufferView_Impl__obj() { }

Dynamic ArrayBufferView_Impl__obj::__CreateEmpty() { return  new ArrayBufferView_Impl__obj; }
hx::ObjectPtr< ArrayBufferView_Impl__obj > ArrayBufferView_Impl__obj::__new()
{  hx::ObjectPtr< ArrayBufferView_Impl__obj > _result_ = new ArrayBufferView_Impl__obj();
	_result_->__construct();
	return _result_;}

Dynamic ArrayBufferView_Impl__obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< ArrayBufferView_Impl__obj > _result_ = new ArrayBufferView_Impl__obj();
	_result_->__construct();
	return _result_;}

::haxe::io::ArrayBufferViewImpl ArrayBufferView_Impl__obj::fromBytes( ::haxe::io::Bytes bytes,hx::Null< int >  __o_pos,Dynamic length){
int pos = __o_pos.Default(0);
	HX_STACK_FRAME("haxe.io._ArrayBufferView.ArrayBufferView_Impl_","fromBytes",0xd52b9d62,"haxe.io._ArrayBufferView.ArrayBufferView_Impl_.fromBytes","/usr/share/haxe/std/haxe/io/ArrayBufferView.hx",67,0x41f0467b)
	HX_STACK_ARG(bytes,"bytes")
	HX_STACK_ARG(pos,"pos")
	HX_STACK_ARG(length,"length")
{
		HX_STACK_LINE(68)
		bool tmp = (length == null());		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(68)
		if ((tmp)){
			HX_STACK_LINE(68)
			int tmp1 = (bytes->length - pos);		HX_STACK_VAR(tmp1,"tmp1");
			HX_STACK_LINE(68)
			length = tmp1;
		}
		HX_STACK_LINE(69)
		bool tmp1 = (pos < (int)0);		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(69)
		bool tmp2 = !(tmp1);		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(69)
		bool tmp3 = tmp2;		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(69)
		bool tmp4;		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(69)
		if ((tmp3)){
			HX_STACK_LINE(69)
			tmp4 = (length < (int)0);
		}
		else{
			HX_STACK_LINE(69)
			tmp4 = true;
		}
		HX_STACK_LINE(69)
		bool tmp5 = !(tmp4);		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(69)
		bool tmp6;		HX_STACK_VAR(tmp6,"tmp6");
		HX_STACK_LINE(69)
		if ((tmp5)){
			HX_STACK_LINE(69)
			int tmp7 = (pos + length);		HX_STACK_VAR(tmp7,"tmp7");
			HX_STACK_LINE(69)
			int tmp8 = tmp7;		HX_STACK_VAR(tmp8,"tmp8");
			HX_STACK_LINE(69)
			int tmp9 = bytes->length;		HX_STACK_VAR(tmp9,"tmp9");
			HX_STACK_LINE(69)
			tmp6 = (tmp8 > tmp9);
		}
		else{
			HX_STACK_LINE(69)
			tmp6 = true;
		}
		HX_STACK_LINE(69)
		if ((tmp6)){
			HX_STACK_LINE(69)
			HX_STACK_DO_THROW(::haxe::io::Error_obj::OutsideBounds);
		}
		HX_STACK_LINE(70)
		::haxe::io::ArrayBufferViewImpl tmp7;		HX_STACK_VAR(tmp7,"tmp7");
		HX_STACK_LINE(70)
		{
			HX_STACK_LINE(70)
			::haxe::io::ArrayBufferViewImpl tmp8 = ::haxe::io::ArrayBufferViewImpl_obj::__new(bytes,pos,length);		HX_STACK_VAR(tmp8,"tmp8");
			HX_STACK_LINE(70)
			::haxe::io::ArrayBufferViewImpl a = tmp8;		HX_STACK_VAR(a,"a");
			HX_STACK_LINE(70)
			tmp7 = a;
		}
		HX_STACK_LINE(70)
		return tmp7;
	}
}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(ArrayBufferView_Impl__obj,fromBytes,return )


ArrayBufferView_Impl__obj::ArrayBufferView_Impl__obj()
{
}

bool ArrayBufferView_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"fromBytes") ) { outValue = fromBytes_dyn(); return true;  }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(ArrayBufferView_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(ArrayBufferView_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class ArrayBufferView_Impl__obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("fromBytes","\xa1","\xf2","\x20","\x72"),
	::String(null()) };

void ArrayBufferView_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("haxe.io._ArrayBufferView.ArrayBufferView_Impl_","\xef","\x3f","\x1e","\x38");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &ArrayBufferView_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< ArrayBufferView_Impl__obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

} // end namespace haxe
} // end namespace io
} // end namespace _ArrayBufferView
