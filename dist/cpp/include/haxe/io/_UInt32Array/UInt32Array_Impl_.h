#ifndef INCLUDED_haxe_io__UInt32Array_UInt32Array_Impl_
#define INCLUDED_haxe_io__UInt32Array_UInt32Array_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,io,ArrayBufferViewImpl)
HX_DECLARE_CLASS2(haxe,io,Bytes)
HX_DECLARE_CLASS3(haxe,io,_UInt32Array,UInt32Array_Impl_)
namespace haxe{
namespace io{
namespace _UInt32Array{


class HXCPP_CLASS_ATTRIBUTES  UInt32Array_Impl__obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef UInt32Array_Impl__obj OBJ_;
		UInt32Array_Impl__obj();
		Void __construct();

	public:
		inline void *operator new( size_t inSize, bool inContainer=false,const char *inName="haxe.io._UInt32Array.UInt32Array_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< UInt32Array_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~UInt32Array_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("UInt32Array_Impl_","\xc0","\x44","\x84","\x28"); }

		static ::haxe::io::ArrayBufferViewImpl fromData( ::haxe::io::ArrayBufferViewImpl d);
		static Dynamic fromData_dyn();

		static ::haxe::io::ArrayBufferViewImpl fromBytes( ::haxe::io::Bytes bytes,hx::Null< int >  bytePos,Dynamic length);
		static Dynamic fromBytes_dyn();

};

} // end namespace haxe
} // end namespace io
} // end namespace _UInt32Array

#endif /* INCLUDED_haxe_io__UInt32Array_UInt32Array_Impl_ */ 
