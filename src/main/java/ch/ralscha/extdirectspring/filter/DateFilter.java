/**
 * Copyright 2010 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ralscha.extdirectspring.filter;

public class DateFilter extends Filter {

	private final String value;
	private final Comparison comparison;

	public DateFilter(final String field, final String value, final Comparison comparison) {
		super(field);
		this.value = value;
		this.comparison = comparison;
	}

	public String getValue() {
		return value;
	}

	public Comparison getComparison() {
		return comparison;
	}

	@Override
	public String toString() {
		return "DateFilter [value=" + value + ", comparison=" + comparison + ", getField()=" + getField() + "]";
	}

}